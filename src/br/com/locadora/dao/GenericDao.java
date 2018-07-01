package br.com.locadora.dao;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import br.com.locadora.bean.ClientesBean;
import br.com.locadora.connection.ConnectionFactory;

public class GenericDao {
	//Atributo para conexao
	private Connection conexao;
	
	//Construtor
	public GenericDao() {
		this.conexao = new ConnectionFactory().obterConexao();
	}
	
	//Método para cadastrar
	
	public void adicionar(Object obj) throws ClassNotFoundException, IllegalArgumentException, IllegalAccessException  {
        String campos = "";
        String dados = "";
        String classe = obj.getClass().getName();
        Class cls = Class.forName(classe);
        System.out.println("classe"+classe);
        System.out.println("cls"+cls);
        Field listaAtributos[] = cls.getDeclaredFields();
        String valorIncluir = "";
        String tipoDado;
        for (int i = 1; i < listaAtributos.length; i++) {
        Field fld = listaAtributos[i];
        fld.setAccessible(true);
        campos = campos + fld.getName() + ", ";
        dados = dados + "'" + fld.get(obj) + "'" + ",";
        }
        campos = campos.substring(0, campos.length() - 2);
        String tabela = cls.getSimpleName();
        tabela = tabela.substring(0, tabela.length()-4);
        dados = dados.substring(0, dados.length() - 1);
        String sql = "INSERT INTO " + tabela
        + " (" + campos + ") VALUES ("
        + dados + ")";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            System.out.println(sql);
        stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(GenericDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Registro ADICIONADO ao banco!");
    }

    public ArrayList<String> listar(Object obj)
            // public void listar(Class c)
            throws SQLException, IllegalAccessException, NoSuchMethodException,
            IllegalArgumentException, InvocationTargetException,
            InstantiationException, ClassNotFoundException {

        String tabela = (Class.forName(obj.getClass().getName())).getSimpleName(); //Retorna o nome da classe
        tabela = tabela.substring(0, tabela.length()-4);
        String sql = "SELECT * FROM " + tabela;
        System.out.println(sql);
        Statement stmt = conexao.createStatement();
        ResultSet rset = stmt.executeQuery(sql);
        ArrayList<String> list = new ArrayList<>();
        while (rset.next()) {
        	list.add(rset.getString(2));
        }
        rset.close();
        stmt.close();

        return list;

    }


   

    public void excluir(Object obj) throws ClassNotFoundException,
            NoSuchFieldException, SQLException {

        String campoTeste = null;
        String campo = null;
        int valorExcluir = 0;
        String classe = obj.getClass().getName();//Nome da classe
        Class cls = Class.forName(classe); //Nome da classe (tabela)
        Field listaAtributos[] = cls.getDeclaredFields(); //array de campos

        for (int i = 0; i < listaAtributos.length; i++) {
            Field fld = listaAtributos[i];
            fld.setAccessible(true);

            try {
                System.out.println("Valor...........: " + fld.get(obj));
                campoTeste = fld.get(obj).toString();
                if (!campoTeste.equals("0")) {
                    System.out.println("OK");
                    campo = fld.getName();
                    valorExcluir = (int) fld.get(obj);
                    break;
                }
            } catch (IllegalAccessException ex) {
                System.out.println("erro: " + ex);
            } catch (NullPointerException ex) {
                campoTeste = null;
            }
        }

        String tabela = cls.getSimpleName();
        tabela = tabela.substring(0, tabela.length()-4);
        String sql = "DELETE FROM " + tabela + " WHERE " + campo + " =?";
        System.out.println("SQL: " + sql);

        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(1, valorExcluir);
        stmt.execute();
        stmt.close();
        System.out.println("Registro EXCLUÍDO no banco!");
    }
}
