import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Main {
    // LISTA DE FRUTAS E MODELO DE LISTA PARA EXIBIÇÃO NA INTERFACE GRÁFICA
    private ArrayList<String> frutas;
    private DefaultListModel<String> listModel;
    private JList<String> list;

    public Main() {
        frutas = new ArrayList<>();
        listModel = new DefaultListModel<>();

        // CRIA O FRAME PRINCIPAL DA APLICAÇÃO
        JFrame frame = new JFrame("Gerenciador de Frutas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 300);
        frame.setLayout(new BorderLayout());

        // PAINEL SUPERIOR COM CAMPO DE TEXTO E BOTÕES
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // CAMPO DE TEXTO PARA ENTRADA DO NOME DA FRUTA
        JTextField frutaField = new JTextField(15);
        panel.add(frutaField);

        // BOTÃO PARA ADICIONAR FRUTAS
        JButton addButton = new JButton("Adicionar");
        panel.add(addButton);

        // BOTÃO PARA MODIFICAR FRUTAS (INICIALMENTE DESATIVADO)
        JButton modifyButton = new JButton("Modificar");
        modifyButton.setEnabled(false);
        panel.add(modifyButton);

        // BOTÃO PARA REMOVER FRUTAS (INICIALMENTE DESATIVADO)
        JButton removeButton = new JButton("Remover");
        removeButton.setEnabled(false);
        panel.add(removeButton);

        frame.add(panel, BorderLayout.NORTH);

        // LISTA PARA EXIBIR AS FRUTAS ADICIONADAS
        list = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(list);
        frame.add(scrollPane, BorderLayout.CENTER);

        // BOTÃO PARA LISTAR TODAS AS FRUTAS
        JButton listButton = new JButton("Listar Frutas");
        frame.add(listButton, BorderLayout.SOUTH);

        // AÇÃO PARA ADICIONAR UMA NOVA FRUTA À LISTA
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String novaFruta = frutaField.getText();
                if (!novaFruta.isEmpty()) {
                    // ADICIONA A FRUTA TANTO NO ARRAYLIST QUANTO NO MODELO DE LISTA PARA EXIBIÇÃO
                    frutas.add(novaFruta);
                    listModel.addElement(novaFruta);
                    frutaField.setText("");
                    JOptionPane.showMessageDialog(frame, novaFruta + " foi adicionada.");
                }
            }
        });

        // AÇÃO PARA MODIFICAR A FRUTA SELECIONADA NA LISTA
        modifyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = list.getSelectedIndex();
                if (selectedIndex != -1) {
                    // OBTÉM A FRUTA SELECIONADA E SOLICITA UM NOVO NOME PARA ELA
                    String frutaSelecionada = listModel.getElementAt(selectedIndex);
                    String novaFruta = JOptionPane.showInputDialog(frame, "Modificar " + frutaSelecionada + " para:", frutaSelecionada);
                    if (novaFruta != null && !novaFruta.isEmpty()) {
                        // ATUALIZA O ARRAYLIST E O MODELO DE LISTA
                        frutas.set(selectedIndex, novaFruta);
                        listModel.set(selectedIndex, novaFruta);
                        JOptionPane.showMessageDialog(frame, "Fruta " + frutaSelecionada + " foi modificada para " + novaFruta + ".");
                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "Selecione uma fruta para modificar.");
                }
            }
        });

        // AÇÃO PARA REMOVER A FRUTA SELECIONADA DA LISTA
        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = list.getSelectedIndex();
                if (selectedIndex != -1) {
                    // REMOVE A FRUTA TANTO DO ARRAYLIST QUANTO DO MODELO DE LISTA
                    String frutaRemovida = frutas.remove(selectedIndex);
                    listModel.remove(selectedIndex);
                    JOptionPane.showMessageDialog(frame, frutaRemovida + " foi removida.");
                } else {
                    JOptionPane.showMessageDialog(frame, "Selecione uma fruta para remover.");
                }
            }
        });

        // AÇÃO PARA LISTAR TODAS AS FRUTAS ARMAZENADAS
        listButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (frutas.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Nenhuma fruta na lista.");
                } else {
                    JOptionPane.showMessageDialog(frame, "Frutas: " + frutas);
                }
            }
        });

        // OUVINTE PARA ATUALIZAR O ESTADO DOS BOTÕES COM BASE NA SELEÇÃO DA LISTA
        list.addListSelectionListener(e -> {
            boolean selectionExists = !list.isSelectionEmpty();
            removeButton.setEnabled(selectionExists);
            modifyButton.setEnabled(selectionExists);
        });

        // TORNA A JANELA VISÍVEL
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // EXECUTA A APLICAÇÃO
        SwingUtilities.invokeLater(Main::new);
    }
}
