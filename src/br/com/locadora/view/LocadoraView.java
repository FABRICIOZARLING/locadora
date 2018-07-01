package br.com.locadora.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.locadora.bean.ClientesBean;
import br.com.locadora.bean.FilmesBean;
import br.com.locadora.bean.FuncionariosBean;
import br.com.locadora.bean.FuturosFilmesBean;
import br.com.locadora.bean.GeneroBean;
import br.com.locadora.bean.LocacoesBean;
import br.com.locadora.bean.PrecosBean;
import br.com.locadora.bean.ProdutorasBean;
import br.com.locadora.bean.TempoBean;
import br.com.locadora.bean.TiposBean;
import br.com.locadora.dao.GenericDao;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class LocadoraView extends JFrame {

	private JPanel contentPane;
	private JTextField tfNomeFuncionario;
	private JTextField tfSalarioFuncionario;
	private JTextField tfCargoFuncionario;
	private JTextField tfNomeCliente;
	private JTextField tfIdadeCliente;
	private JTextField tfNomeGenero;
	private JTextField tfNomeFilme;
	private JTextField tfDataNovoFilme;
	private JTextField tfClassificacao;
	private JTextField tfLocacaoTempo;
	private JTextField tfLocacaoPreco;


	public LocadoraView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(750, 600);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		GenericDao gd = new GenericDao();
		
		JButton btnClientes = new JButton("Clientes");
		btnClientes.setBounds(10, 11, 179, 23);
		contentPane.add(btnClientes);
		
		JButton btnLocacao = new JButton("Loca\u00E7\u00E3o");
		btnLocacao.setBounds(189, 11, 178, 23);
		contentPane.add(btnLocacao);
		
		JButton btnFilmes = new JButton("Filmes");
		btnFilmes.setBounds(367, 11, 178, 23);
		contentPane.add(btnFilmes);
		
		JButton btnFuncionarios = new JButton("Funcion\u00E1rios");

		btnFuncionarios.setBounds(545, 11, 179, 23);
		contentPane.add(btnFuncionarios);
		
		JPanel panelFuncionarios = new JPanel();
		panelFuncionarios.setBounds(10, 45, 714, 505);
		contentPane.add(panelFuncionarios);
		panelFuncionarios.setLayout(null);
		
		JLabel lblNomeFuncionario = new JLabel("Nome ");
		lblNomeFuncionario.setBounds(128, 75, 46, 14);
		panelFuncionarios.add(lblNomeFuncionario);
		
		JLabel lblSalario = new JLabel("Salario");
		lblSalario.setBounds(128, 137, 46, 14);
		panelFuncionarios.add(lblSalario);
		
		JLabel lblCargo = new JLabel("Cargo");
		lblCargo.setBounds(128, 198, 46, 14);
		panelFuncionarios.add(lblCargo);
		
		tfNomeFuncionario = new JTextField();
		tfNomeFuncionario.setBounds(228, 72, 408, 20);
		panelFuncionarios.add(tfNomeFuncionario);
		tfNomeFuncionario.setColumns(10);
		
		tfSalarioFuncionario = new JTextField();
		tfSalarioFuncionario.setBounds(228, 134, 408, 20);
		panelFuncionarios.add(tfSalarioFuncionario);
		tfSalarioFuncionario.setColumns(10);
		
		tfCargoFuncionario = new JTextField();
		tfCargoFuncionario.setBounds(228, 195, 408, 20);
		panelFuncionarios.add(tfCargoFuncionario);
		tfCargoFuncionario.setColumns(10);
		
		JButton btnGravarFuncionario = new JButton("Gravar");
		btnGravarFuncionario.setBounds(547, 262, 89, 23);
		panelFuncionarios.add(btnGravarFuncionario);
		
		JComboBox comboDelFuncionario = new JComboBox();
		comboDelFuncionario.setBounds(128, 352, 400, 20);
		panelFuncionarios.add(comboDelFuncionario);
		
		JButton btnDeletarFuncionario = new JButton("Deletar");
		btnDeletarFuncionario.setBounds(547, 350, 89, 23);
		panelFuncionarios.add(btnDeletarFuncionario);
		
		 JPanel panelClientes = new JPanel();
		panelClientes.setBounds(10, 45, 714, 505);
		contentPane.add(panelClientes);
		panelClientes.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(114, 69, 46, 14);
		panelClientes.add(lblNome);
		
		JLabel lblIdade = new JLabel("Idade");
		lblIdade.setBounds(114, 115, 46, 14);
		panelClientes.add(lblIdade);
		
		tfNomeCliente = new JTextField();
		tfNomeCliente.setBounds(170, 66, 452, 20);
		panelClientes.add(tfNomeCliente);
		tfNomeCliente.setColumns(10);
		
		tfIdadeCliente = new JTextField();
		tfIdadeCliente.setBounds(170, 112, 163, 20);
		panelClientes.add(tfIdadeCliente);
		tfIdadeCliente.setColumns(10);
		
		JButton btnSalvarCliente = new JButton("Gravar");
		btnSalvarCliente.setBounds(533, 111, 89, 23);
		panelClientes.add(btnSalvarCliente);
		
		JComboBox comboDelClientes = new JComboBox();
		comboDelClientes.setBounds(114, 242, 400, 20);
		panelClientes.add(comboDelClientes);
		
		JButton btnDeletarCliente = new JButton("Deletar");
		btnDeletarCliente.setBounds(533, 240, 89, 23);
		panelClientes.add(btnDeletarCliente);
		
		JPanel panelFilmes = new JPanel();
		panelFilmes.setBounds(10, 45, 714, 505);
		contentPane.add(panelFilmes);
		panelFilmes.setLayout(null);
		
		JButton btnCadastrarFilme = new JButton("Cadastrar Filme");
		btnCadastrarFilme.setBounds(0, 0, 143, 23);
		panelFilmes.add(btnCadastrarFilme);
		
		JButton btnProdutoras = new JButton("Cadastrar Produtora");
		btnProdutoras.setBounds(571, 0, 143, 23);
		panelFilmes.add(btnProdutoras);
		
		JButton btnLancamentos = new JButton("Cadastrar Lancamento");
		btnLancamentos.setBounds(143, 0, 143, 23);
		panelFilmes.add(btnLancamentos);
		
		JButton btnGenero = new JButton("Cadastrar Genero");
		btnGenero.setBounds(286, 0, 142, 23);
		panelFilmes.add(btnGenero);
		
		JButton btnTipo = new JButton("Cadastrar Tipo");
		btnTipo.setBounds(428, 0, 143, 23);
		panelFilmes.add(btnTipo);
		
		JPanel panelProdutora = new JPanel();
		panelProdutora.setBounds(10, 34, 694, 460);
		panelFilmes.add(panelProdutora);
		panelProdutora.setLayout(null);
		
		JLabel lblProdutora = new JLabel("Nome da Produtora");
		lblProdutora.setBounds(65, 86, 141, 14);
		panelProdutora.add(lblProdutora);
		
		JTextField tfNomeProdutora = new JTextField();
		tfNomeProdutora.setBounds(174, 83, 453, 20);
		panelProdutora.add(tfNomeProdutora);
		tfNomeProdutora.setColumns(10);
		
		JButton btnSalvarProdutora = new JButton("Salvar");
		btnSalvarProdutora.setBounds(538, 128, 89, 23);
		panelProdutora.add(btnSalvarProdutora);
		
		JComboBox comboDelProdutora = new JComboBox();
		comboDelProdutora.setBounds(117, 252, 400, 20);
		panelProdutora.add(comboDelProdutora);
		
		JButton btnDeletarProdutora = new JButton("Deletar");
		btnDeletarProdutora.setBounds(538, 250, 89, 23);
		panelProdutora.add(btnDeletarProdutora);
		
		JPanel panelTipo = new JPanel();
		panelTipo.setBounds(10, 34, 694, 460);
		panelFilmes.add(panelTipo);
		panelTipo.setLayout(null);
		
		JLabel lblTipo = new JLabel("Descrição Tipo");
		lblTipo.setBounds(65, 86, 141, 14);
		panelTipo.add(lblTipo);
		
		JTextField tfNomeTipo = new JTextField();
		tfNomeTipo.setBounds(174, 83, 453, 20);
		panelTipo.add(tfNomeTipo);
		tfNomeTipo.setColumns(10);
		
		JButton btnSalvarTipo = new JButton("Salvar");
		btnSalvarTipo.setBounds(538, 128, 89, 23);
		panelTipo.add(btnSalvarTipo);
		
		JComboBox comboDelTipo = new JComboBox();
		comboDelTipo.setBounds(117, 252, 400, 20);
		panelTipo.add(comboDelTipo);
		
		JButton btnDeletarTipo = new JButton("Deletar");
		btnDeletarTipo.setBounds(538, 250, 89, 23);
		panelTipo.add(btnDeletarTipo);
		
		JPanel panelGenero = new JPanel();
		panelGenero.setBounds(10, 34, 694, 460);
		panelFilmes.add(panelGenero);
		panelGenero.setLayout(null);
		
		JLabel lblGenero = new JLabel("Descrição Genero");
		lblGenero.setBounds(65, 86, 141, 14);
		panelGenero.add(lblGenero);
		
		tfNomeGenero = new JTextField();
		tfNomeGenero.setBounds(174, 83, 453, 20);
		panelGenero.add(tfNomeGenero);
		tfNomeGenero.setColumns(10);
		
		JButton btnSalvarGenero = new JButton("Salvar");
		btnSalvarGenero.setBounds(538, 128, 89, 23);
		panelGenero.add(btnSalvarGenero);
		
		JComboBox comboDelGenero = new JComboBox();
		comboDelGenero.setBounds(117, 252, 400, 20);
		panelGenero.add(comboDelGenero);
		
		JButton btnDeletarGenero = new JButton("Deletar");
		btnDeletarGenero.setBounds(538, 250, 89, 23);
		panelGenero.add(btnDeletarGenero);
		
		JPanel panelLancamento = new JPanel();
		panelLancamento.setBounds(10, 34, 694, 460);
		panelFilmes.add(panelLancamento);
		panelLancamento.setLayout(null);
		
		JLabel lblNomeFilme = new JLabel("T\u00EDtulo");
		lblNomeFilme.setBounds(84, 66, 46, 14);
		panelLancamento.add(lblNomeFilme);
		
		JTextField tfNomeLancamento = new JTextField();
		tfNomeLancamento.setBounds(159, 63, 443, 20);
		panelLancamento.add(tfNomeLancamento);
		tfNomeLancamento.setColumns(10);
		
		JLabel lblGenero1 = new JLabel("Genero");
		lblGenero1.setBounds(84, 120, 46, 14);
		panelLancamento.add(lblGenero1);
		
		JComboBox comboGenero = new JComboBox();
		comboGenero.setBounds(159, 117, 443, 20);
		panelLancamento.add(comboGenero);
		
		JLabel lblDataLancamento = new JLabel("Data");
		lblDataLancamento.setBounds(84, 177, 46, 14);
		panelLancamento.add(lblDataLancamento);
		
		JTextField tfDataLancamento = new JTextField();
		tfDataLancamento.setText("");
		tfDataLancamento.setBounds(160, 174, 172, 20);
		panelLancamento.add(tfDataLancamento);
		tfDataLancamento.setColumns(10);
		
		JButton btnSalvarLancamento = new JButton("Salvar");
		btnSalvarLancamento.setBounds(430, 173, 172, 23);
		panelLancamento.add(btnSalvarLancamento);
		
		JPanel panelNovoFilme = new JPanel();
		panelNovoFilme.setBounds(10, 34, 694, 460);
		panelFilmes.add(panelNovoFilme);
		panelNovoFilme.setLayout(null);
		JLabel lblNomeFilme1 = new JLabel("T\u00EDtulo");
		lblNomeFilme1.setBounds(84, 66, 65, 14);
		panelNovoFilme.add(lblNomeFilme1);
		
		tfNomeFilme = new JTextField();
		tfNomeFilme.setBounds(159, 63, 443, 20);
		panelNovoFilme.add(tfNomeFilme);
		tfNomeFilme.setColumns(10);
		
		JLabel lblGenero2 = new JLabel("Genero");
		lblGenero2.setBounds(84, 120, 65, 14);
		panelNovoFilme.add(lblGenero2);
		
		JComboBox comboGeneroFilme = new JComboBox();
		comboGeneroFilme.setBounds(159, 117, 443, 20);
		panelNovoFilme.add(comboGeneroFilme);
		
		JLabel lblDataLancamento1 = new JLabel("Data Lan\u00E7amento");
		lblDataLancamento1.setBounds(84, 330, 110, 14);
		panelNovoFilme.add(lblDataLancamento1);
		
		tfDataNovoFilme = new JTextField();
		tfDataNovoFilme.setText("");
		tfDataNovoFilme.setBounds(223, 327, 172, 20);
		panelNovoFilme.add(tfDataNovoFilme);
		tfDataNovoFilme.setColumns(10);
		
		JLabel lblEstoque = new JLabel("Quantidade estoque");
		lblEstoque.setBounds(84, 370, 110, 14);
		panelNovoFilme.add(lblEstoque);
		
		JTextField tfEstoque = new JTextField();
		tfEstoque.setText("");
		tfEstoque.setBounds(223, 367, 172, 20);
		panelNovoFilme.add(tfEstoque);
		tfEstoque.setColumns(10);
		
		JButton btnSalvarNovoFilme = new JButton("Salvar");
		btnSalvarNovoFilme.setBounds(430, 366, 172, 23);
		panelNovoFilme.add(btnSalvarNovoFilme);
		
		JLabel lblProdutora1 = new JLabel("Produtora");
		lblProdutora1.setBounds(84, 175, 65, 14);
		panelNovoFilme.add(lblProdutora1);
		
		JComboBox comboProdutora = new JComboBox();
		comboProdutora.setBounds(159, 172, 443, 20);
		panelNovoFilme.add(comboProdutora);
		
		JLabel lblClassificao = new JLabel("Classifica\u00E7\u00E3o");
		lblClassificao.setBounds(84, 220, 65, 14);
		panelNovoFilme.add(lblClassificao);
		
		tfClassificacao = new JTextField();
		tfClassificacao.setColumns(10);
		tfClassificacao.setBounds(159, 217, 443, 20);
		panelNovoFilme.add(tfClassificacao);
		
		JLabel lblTipo1 = new JLabel("Tipo");
		lblTipo1.setBounds(84, 268, 65, 14);
		panelNovoFilme.add(lblTipo1);
		
		JComboBox comboTipo = new JComboBox();
		comboTipo.setBounds(159, 265, 443, 20);
		panelNovoFilme.add(comboTipo);

		JPanel panelLocacoes = new JPanel();
		panelLocacoes.setBounds(10, 45, 714, 505);
		contentPane.add(panelLocacoes);
		panelLocacoes.setLayout(null);
		
		JLabel lblCliente = new JLabel("Cliente");
		lblCliente.setBounds(45, 25, 135, 14);
		panelLocacoes.add(lblCliente);
		
		JComboBox cbLocacaoCliente = new JComboBox();
		cbLocacaoCliente.setBounds(202, 22, 455, 20);
		panelLocacoes.add(cbLocacaoCliente);
		
		JLabel lblFilme = new JLabel("Filme");
		lblFilme.setBounds(45, 64, 135, 14);
		panelLocacoes.add(lblFilme);
		
		JComboBox cbLocacaoFilme = new JComboBox();
		cbLocacaoFilme.setBounds(202, 61, 455, 20);
		panelLocacoes.add(cbLocacaoFilme);
		
		JLabel lblTempoLocacao = new JLabel("Tempo");
		lblTempoLocacao.setBounds(45, 114, 46, 14);
		panelLocacoes.add(lblTempoLocacao);
		
		tfLocacaoTempo = new JTextField();
		tfLocacaoTempo.setBounds(202, 111, 112, 20);
		panelLocacoes.add(tfLocacaoTempo);
		tfLocacaoTempo.setColumns(10);
		
		JLabel lblPrecolocacao = new JLabel("Pre\u00E7o");
		lblPrecolocacao.setBounds(406, 114, 46, 14);
		panelLocacoes.add(lblPrecolocacao);
		
		tfLocacaoPreco = new JTextField();
		tfLocacaoPreco.setBounds(545, 111, 112, 20);
		panelLocacoes.add(tfLocacaoPreco);
		tfLocacaoPreco.setColumns(10);
		
		JLabel lblVendedor = new JLabel("Vendedor");
		lblVendedor.setBounds(45, 162, 46, 14);
		panelLocacoes.add(lblVendedor);
		
		JComboBox cbLocacaoVendedor = new JComboBox();
		cbLocacaoVendedor.setBounds(202, 159, 455, 20);
		panelLocacoes.add(cbLocacaoVendedor);
		
		JLabel lblTipoL = new JLabel("Tipo");
		lblTipoL.setBounds(45, 236, 46, 14);
		panelLocacoes.add(lblTipoL);
		
		JTextField tfLocacaoTipo = new JTextField();
		tfLocacaoTipo.setBounds(202, 236, 112, 20);
		panelLocacoes.add(tfLocacaoTipo);
		tfLocacaoTipo.setColumns(10);
		
		JButton btnSalvarLocacao = new JButton("Salvar");
		btnSalvarLocacao.setBounds(468, 236, 189, 23);
		
		panelLocacoes.add(btnSalvarLocacao);
		panelClientes.setVisible(false);
		panelFilmes.setVisible(false);
		panelFuncionarios.setVisible(false);
		panelLocacoes.setVisible(false);
		panelGenero.setVisible(false);
		panelTipo.setVisible(false);
		panelProdutora.setVisible(false);
		panelNovoFilme.setVisible(false);
		panelLancamento.setVisible(false);
		
		btnClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelClientes.setVisible(true);
				panelFilmes.setVisible(false);
				panelFuncionarios.setVisible(false);
				panelLocacoes.setVisible(false);
				ClientesBean cb = new  ClientesBean();
				ArrayList<String> list;
				try {
					list = gd.listar(cb);
					for(int x = comboDelClientes.getItemCount(); x<list.size(); x++) {
						comboDelClientes.addItem(list.get(x));
					}
					
				} catch (IllegalAccessException | NoSuchMethodException | IllegalArgumentException
						| InvocationTargetException | InstantiationException | ClassNotFoundException
						| SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnLocacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelClientes.setVisible(false);
				panelFilmes.setVisible(false);
				panelFuncionarios.setVisible(false);
				panelLocacoes.setVisible(true);
				ClientesBean cb = new  ClientesBean();
				FilmesBean fb = new FilmesBean();
				FuncionariosBean vb = new FuncionariosBean();
				ArrayList<String> list;
				try {
					list = gd.listar(cb);
					for(int x = cbLocacaoCliente.getItemCount(); x<list.size(); x++) {
						cbLocacaoCliente.addItem(list.get(x));
					}
					list = gd.listar(fb);
					for(int x = cbLocacaoFilme.getItemCount(); x<list.size(); x++) {
						cbLocacaoFilme.addItem(list.get(x));
					}
					list = gd.listar(vb);
					for(int x = cbLocacaoVendedor.getItemCount(); x<list.size(); x++) {
						cbLocacaoVendedor.addItem(list.get(x));
					}
					
				} catch (IllegalAccessException | NoSuchMethodException | IllegalArgumentException
						| InvocationTargetException | InstantiationException | ClassNotFoundException
						| SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnFilmes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelClientes.setVisible(false);
				panelFilmes.setVisible(true);
				panelFuncionarios.setVisible(false);
				panelLocacoes.setVisible(false);
			}
		});
		btnFuncionarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelClientes.setVisible(false);
				panelFilmes.setVisible(false);
				panelFuncionarios.setVisible(true);
				panelLocacoes.setVisible(false);
				FuncionariosBean vb = new FuncionariosBean();
				ArrayList<String> list;
				try {
					list = gd.listar(vb);
					for(int x = comboDelFuncionario.getItemCount(); x<list.size(); x++) {
						comboDelFuncionario.addItem(list.get(x));
					}
					
				} catch (IllegalAccessException | NoSuchMethodException | IllegalArgumentException
						| InvocationTargetException | InstantiationException | ClassNotFoundException
						| SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnProdutoras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelGenero.setVisible(false);
				panelTipo.setVisible(false);
				panelProdutora.setVisible(true);
				panelNovoFilme.setVisible(false);
				panelLancamento.setVisible(false);
				ProdutorasBean pb = new ProdutorasBean();
				ArrayList<String> list;
				try {

					list = gd.listar(pb);
					for(int x = comboDelProdutora.getItemCount(); x<list.size(); x++) {
						comboDelProdutora.addItem(list.get(x));
					}
					
				} catch (IllegalAccessException | NoSuchMethodException | IllegalArgumentException
						| InvocationTargetException | InstantiationException | ClassNotFoundException
						| SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnCadastrarFilme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelGenero.setVisible(false);
				panelTipo.setVisible(false);
				panelProdutora.setVisible(false);
				panelNovoFilme.setVisible(true);
				panelLancamento.setVisible(false);
				GeneroBean gb = new GeneroBean();
				ProdutorasBean pb = new ProdutorasBean();
				TiposBean tb = new TiposBean();
				ArrayList<String> list;
				try {
					list = gd.listar(gb);
					for(int x = comboGeneroFilme.getItemCount(); x<list.size(); x++) {
						comboGeneroFilme.addItem(list.get(x));
					}
					list = gd.listar(pb);
					for(int x = comboProdutora.getItemCount(); x<list.size(); x++) {
						comboProdutora.addItem(list.get(x));
					}

					list = gd.listar(tb);
					for(int x = comboTipo.getItemCount(); x<list.size(); x++) {
						comboTipo.addItem(list.get(x));
					}


				} catch (IllegalAccessException | NoSuchMethodException | IllegalArgumentException
						| InvocationTargetException | InstantiationException | ClassNotFoundException
						| SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		btnGenero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelGenero.setVisible(true);
				panelTipo.setVisible(false);
				panelProdutora.setVisible(false);
				panelNovoFilme.setVisible(false);
				panelLancamento.setVisible(false);
				GeneroBean gb = new GeneroBean();
				ArrayList<String> list;
				try {
					list = gd.listar(gb);
					for(int x = comboDelGenero.getItemCount(); x<list.size(); x++) {
						comboDelGenero.addItem(list.get(x));
					}
					
				} catch (IllegalAccessException | NoSuchMethodException | IllegalArgumentException
						| InvocationTargetException | InstantiationException | ClassNotFoundException
						| SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnLancamentos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelGenero.setVisible(false);
				panelTipo.setVisible(false);
				panelProdutora.setVisible(false);
				panelNovoFilme.setVisible(false);
				panelLancamento.setVisible(true);
				GeneroBean gb = new GeneroBean();
				ArrayList<String> list;
				try {
					list = gd.listar(gb);
					for(int x = comboGenero.getItemCount(); x<list.size(); x++) {
						comboGenero.addItem(list.get(x));
					}

				} catch (IllegalAccessException | NoSuchMethodException | IllegalArgumentException
						| InvocationTargetException | InstantiationException | ClassNotFoundException
						| SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnTipo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelGenero.setVisible(false);
				panelTipo.setVisible(true);
				panelProdutora.setVisible(false);
				panelNovoFilme.setVisible(false);
				panelLancamento.setVisible(false);
				TiposBean tb = new TiposBean();
				ArrayList<String> list;
				try {
					list = gd.listar(tb);
					for(int x = comboDelTipo.getItemCount(); x<list.size(); x++) {
						comboDelTipo.addItem(list.get(x));
					}
					
				} catch (IllegalAccessException | NoSuchMethodException | IllegalArgumentException
						| InvocationTargetException | InstantiationException | ClassNotFoundException
						| SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnDeletarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ClientesBean cb = new ClientesBean();
				cb.setIdCliente(comboDelClientes.getSelectedIndex()+1);
				try {
					gd.excluir(cb);;
				} catch (ClassNotFoundException | IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (NoSuchFieldException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnDeletarFuncionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FuncionariosBean fb = new FuncionariosBean();
				fb.setIdFuncionario(comboDelFuncionario.getSelectedIndex()+1);
				try {
					gd.excluir(fb);;
				} catch (ClassNotFoundException | IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (NoSuchFieldException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnDeletarGenero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GeneroBean gb = new GeneroBean();
				gb.setIdGenero(comboDelGenero.getSelectedIndex()+1);
				try {
					gd.excluir(gb);;
				} catch (ClassNotFoundException | IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (NoSuchFieldException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnDeletarProdutora.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ProdutorasBean pb = new ProdutorasBean();
				pb.setIdProdutora(comboDelProdutora.getSelectedIndex()+1);
				try {
					gd.excluir(pb);;
				} catch (ClassNotFoundException | IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (NoSuchFieldException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnDeletarTipo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TiposBean tb = new TiposBean();
				tb.setIdTipo(comboDelTipo.getSelectedIndex()+1);
				try {
					gd.excluir(tb);;
				} catch (ClassNotFoundException | IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (NoSuchFieldException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		btnGravarFuncionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FuncionariosBean fb = new FuncionariosBean();
				fb.setNomeFuncionario(tfNomeFuncionario.getText());
				fb.setCargoFuncionario(tfCargoFuncionario.getText());
				fb.setSalarioFuncionario(Double.parseDouble(tfSalarioFuncionario.getText()));
				try {
					gd.adicionar(fb);
				} catch (ClassNotFoundException | IllegalArgumentException | IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		btnSalvarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ClientesBean cb = new  ClientesBean();
				cb.setNomeCliente(tfNomeCliente.getText());
				cb.setIdadeCliente(Integer.parseInt(tfIdadeCliente.getText()));
				try {
					gd.adicionar(cb);
				} catch (ClassNotFoundException | IllegalArgumentException | IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnSalvarGenero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GeneroBean gb = new GeneroBean();
				gb.setNomeGenero(tfNomeGenero.getText());
				try {
					gd.adicionar(gb);
				} catch (ClassNotFoundException | IllegalArgumentException | IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnSalvarLancamento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FuturosFilmesBean fb = new FuturosFilmesBean();
				fb.setNomeFilme(tfNomeLancamento.getText());
				fb.setIdGenero(comboGenero.getSelectedIndex()+1);
				fb.setDataLancamento(tfDataLancamento.getText());
				try {
					gd.adicionar(fb);
				} catch (ClassNotFoundException | IllegalArgumentException | IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnSalvarLocacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LocacoesBean lc = new LocacoesBean();
				TempoBean tb = new TempoBean();
				PrecosBean pb = new  PrecosBean();
				lc.setIdCliente(cbLocacaoCliente.getSelectedIndex()+1);
				lc.setIdFilme(cbLocacaoFilme.getSelectedIndex()+1);
				pb.setValor(Double.parseDouble(tfLocacaoPreco.getText()));
				pb.setTipo(tfLocacaoTipo.getText());
				tb.setQtdDias(Integer.parseInt(tfLocacaoTempo.getText()));
				Calendar c = Calendar.getInstance();
				tb.setDiaAlugado(c.YEAR+"-"+c.MONTH+"-"+c.DAY_OF_MONTH);
				System.out.println(c.getTime());
				c.add(c.DAY_OF_YEAR, +(Integer.parseInt(tfLocacaoTempo.getText())));
				tb.setDiaDevolvido(c.YEAR+"-"+c.MONTH+"-"+c.DAY_OF_MONTH);
	
				lc.setIdFuncionario(cbLocacaoVendedor.getSelectedIndex()+1);	
				try {
					ArrayList<String> p = gd.listar(pb);
					ArrayList<String> t = gd.listar(tb);
					lc.setIdPreco(p.size()+1);
					lc.setIdTempo(p.size()+1);
					gd.adicionar(tb);
					gd.adicionar(pb);
					gd.adicionar(lc);
				} catch (ClassNotFoundException | IllegalArgumentException | IllegalAccessException | NoSuchMethodException | InvocationTargetException | InstantiationException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnSalvarNovoFilme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FilmesBean fb = new FilmesBean();
				fb.setNomeFilme(tfNomeFilme.getText());
				fb.setDatalancamento(tfDataNovoFilme.getText());
				fb.setIdadeclassificacao(Integer.parseInt(tfClassificacao.getText()));
				fb.setIdGenero(comboGeneroFilme.getSelectedIndex()+1);
				fb.setIdProdutora(comboProdutora.getSelectedIndex()+1);
				fb.setIdTipo(comboTipo.getSelectedIndex()+1);
				fb.setEstoque(Integer.parseInt(tfEstoque.getText()));
				
				try {
					gd.adicionar(fb);
				} catch (ClassNotFoundException | IllegalArgumentException | IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		btnSalvarProdutora.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ProdutorasBean pb = new ProdutorasBean();
				pb.setNomeProdutora(tfNomeProdutora.getText());
				try {
					gd.adicionar(pb);
				} catch (ClassNotFoundException | IllegalArgumentException | IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnSalvarTipo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TiposBean tb = new  TiposBean();
				tb.setNomeTipo(tfNomeTipo.getText());
				try {
					gd.adicionar(tb);
				} catch (ClassNotFoundException | IllegalArgumentException | IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
	}
}
