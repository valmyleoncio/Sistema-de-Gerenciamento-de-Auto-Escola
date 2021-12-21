package views;
import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;
import controllers.SystemController;
import entities.AulaTeorica;
import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Locale;

public class FragmentInscreverAulas extends JPanel {

    private JPanel mainPanel;
    private JPanel mainLista;
    private JList listaAulas;
    private CardLayout cl;
    private JScrollPane scrollPanel;
    private JButton voltarButton;
    private JPanel mainInfo;
    private JLabel professorLabel;
    private JLabel cargaLabel;
    private JLabel disciplinaLabel;
    private JLabel horarioLabel;
    private JLabel dataLabel;
    private JLabel capacidadeLabel;
    private JLabel códigoLabel;
    private JLabel salaLabel;
    private JButton confirmarIncriçãoButton;

    public FragmentInscreverAulas() {
        configPanels();
    }

    public void configPanels() {
        mainLista = new JPanel();
        mainLista.setLayout(new GridLayoutManager(2, 1, new Insets(0, 3, 0, 3), -1, -1));
        mainLista.setBackground(new Color(-1));
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayoutManager(1, 5, new Insets(0, 0, 0, 0), -1, -1));
        panel1.setBackground(new Color(-1));
        mainLista.add(panel1, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 5, false));
        final JLabel label1 = new JLabel();
        Font label1Font = this.getFont(null, -1, 14, label1.getFont());
        if (label1Font != null) label1.setFont(label1Font);
        label1.setForeground(new Color(-15038977));
        label1.setText("Tipo");
        panel1.add(label1, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_EAST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(180, -1), null, 2, false));
        final JLabel label2 = new JLabel();
        Font label2Font = this.getFont(null, -1, 14, label2.getFont());
        if (label2Font != null) label2.setFont(label2Font);
        label2.setForeground(new Color(-15038977));
        label2.setText("Data");
        panel1.add(label2, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(143, 20), null, 0, false));
        final JLabel label3 = new JLabel();
        Font label3Font = this.getFont(null, -1, 14, label3.getFont());
        if (label3Font != null) label3.setFont(label3Font);
        label3.setForeground(new Color(-15038977));
        label3.setText("Horário");
        panel1.add(label3, new GridConstraints(0, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(158, -1), null, 0, false));
        final JLabel label4 = new JLabel();
        Font label4Font = this.getFont(null, -1, 14, label4.getFont());
        if (label4Font != null) label4.setFont(label4Font);
        label4.setForeground(new Color(-15038977));
        label4.setText("Disciplina");
        panel1.add(label4, new GridConstraints(0, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer1 = new Spacer();
        panel1.add(spacer1, new GridConstraints(0, 4, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        panel2.setBackground(new Color(-1));
        mainLista.add(panel2, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        scrollPanel = new JScrollPane();
        scrollPanel.setBackground(new Color(-1));
        panel2.add(scrollPanel, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(-1, 600), null, 0, false));
        listaAulas = new JList();
        listaAulas.setBackground(new Color(-1));
        listaAulas.setFocusable(false);
        listaAulas.setVerifyInputWhenFocusTarget(false);
        scrollPanel.setViewportView(listaAulas);

        mainInfo = new JPanel();
        mainInfo.setLayout(new GridLayoutManager(2, 1, new Insets(0, 0, 0, 0), -1, -1));
        final JPanel panel6 = new JPanel();
        panel6.setLayout(new GridLayoutManager(1, 1, new Insets(0, 40, 10, 0), -1, -1));
        mainInfo.add(panel6, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_NORTHWEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        voltarButton = new JButton();
        voltarButton.setBackground(new Color(-13684426));
        voltarButton.setBorderPainted(false);
        voltarButton.setFocusPainted(true);
        voltarButton.setFocusable(false);
        Font voltarButtonFont = this.getFont(null, Font.BOLD, 16, voltarButton.getFont());
        if (voltarButtonFont != null) voltarButton.setFont(voltarButtonFont);
        voltarButton.setForeground(new Color(-1));
        voltarButton.setText("Voltar");
        panel6.add(voltarButton, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(-1, 10), null, 0, false));
        final JPanel panel3 = new JPanel();
        panel3.setLayout(new GridLayoutManager(9, 2, new Insets(0, 0, 0, 0), -1, -1));
        mainInfo.add(panel3, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        final JLabel label14 = new JLabel();
        Font label14Font = this.getFont(null, Font.BOLD, 16, label14.getFont());
        if (label14Font != null) label14.setFont(label14Font);
        label14.setForeground(new Color(-16777216));
        label14.setText("Professor:");
        panel3.add(label14, new GridConstraints(4, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        professorLabel = new JLabel();
        Font professorLabelFont = this.getFont(null, Font.BOLD, 16, professorLabel.getFont());
        if (professorLabelFont != null) professorLabel.setFont(professorLabelFont);
        professorLabel.setForeground(new Color(-15506496));
        professorLabel.setText("Label");
        panel3.add(professorLabel, new GridConstraints(4, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label15 = new JLabel();
        Font label15Font = this.getFont(null, Font.BOLD, 16, label15.getFont());
        if (label15Font != null) label15.setFont(label15Font);
        label15.setForeground(new Color(-16777216));
        label15.setText("Carga Horária:");
        panel3.add(label15, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(200, -1), null, 0, false));
        cargaLabel = new JLabel();
        Font cargaLabelFont = this.getFont(null, Font.BOLD, 16, cargaLabel.getFont());
        if (cargaLabelFont != null) cargaLabel.setFont(cargaLabelFont);
        cargaLabel.setForeground(new Color(-15506496));
        cargaLabel.setText("Label");
        panel3.add(cargaLabel, new GridConstraints(3, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label8 = new JLabel();
        Font label8Font = this.getFont(null, Font.BOLD, 16, label8.getFont());
        if (label8Font != null) label8.setFont(label8Font);
        label8.setForeground(new Color(-16777216));
        label8.setText("Disciplina:");
        panel3.add(label8, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        disciplinaLabel = new JLabel();
        Font disciplinaLabelFont = this.getFont(null, Font.BOLD, 16, disciplinaLabel.getFont());
        if (disciplinaLabelFont != null) disciplinaLabel.setFont(disciplinaLabelFont);
        disciplinaLabel.setForeground(new Color(-15506496));
        disciplinaLabel.setText("Label");
        panel3.add(disciplinaLabel, new GridConstraints(2, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label9 = new JLabel();
        Font label9Font = this.getFont(null, Font.BOLD, 16, label9.getFont());
        if (label9Font != null) label9.setFont(label9Font);
        label9.setForeground(new Color(-16777216));
        label9.setText("Horário:");
        panel3.add(label9, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        horarioLabel = new JLabel();
        Font horarioLabelFont = this.getFont(null, Font.BOLD, 16, horarioLabel.getFont());
        if (horarioLabelFont != null) horarioLabel.setFont(horarioLabelFont);
        horarioLabel.setForeground(new Color(-15506496));
        horarioLabel.setText("Label");
        panel3.add(horarioLabel, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label10 = new JLabel();
        Font label10Font = this.getFont(null, Font.BOLD, 16, label10.getFont());
        if (label10Font != null) label10.setFont(label10Font);
        label10.setForeground(new Color(-16777216));
        label10.setText("Data:");
        panel3.add(label10, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        dataLabel = new JLabel();
        Font dataLabelFont = this.getFont(null, Font.BOLD, 16, dataLabel.getFont());
        if (dataLabelFont != null) dataLabel.setFont(dataLabelFont);
        dataLabel.setForeground(new Color(-15506496));
        dataLabel.setText("Label");
        panel3.add(dataLabel, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label11 = new JLabel();
        Font label11Font = this.getFont(null, Font.BOLD, 16, label11.getFont());
        if (label11Font != null) label11.setFont(label11Font);
        label11.setForeground(new Color(-16777216));
        label11.setText("Capacidade:");
        panel3.add(label11, new GridConstraints(5, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        capacidadeLabel = new JLabel();
        Font capacidadeLabelFont = this.getFont(null, Font.BOLD, 16, capacidadeLabel.getFont());
        if (capacidadeLabelFont != null) capacidadeLabel.setFont(capacidadeLabelFont);
        capacidadeLabel.setForeground(new Color(-15506496));
        capacidadeLabel.setText("Label");
        panel3.add(capacidadeLabel, new GridConstraints(5, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label12 = new JLabel();
        Font label12Font = this.getFont(null, Font.BOLD, 16, label12.getFont());
        if (label12Font != null) label12.setFont(label12Font);
        label12.setForeground(new Color(-16777216));
        label12.setText("Código:");
        panel3.add(label12, new GridConstraints(6, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label13 = new JLabel();
        Font label13Font = this.getFont(null, Font.BOLD, 16, label13.getFont());
        if (label13Font != null) label13.setFont(label13Font);
        label13.setForeground(new Color(-16777216));
        label13.setText("Sala:");
        panel3.add(label13, new GridConstraints(7, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        códigoLabel = new JLabel();
        Font códigoLabelFont = this.getFont(null, Font.BOLD, 16, códigoLabel.getFont());
        if (códigoLabelFont != null) códigoLabel.setFont(códigoLabelFont);
        códigoLabel.setForeground(new Color(-15506496));
        códigoLabel.setText("Label");
        panel3.add(códigoLabel, new GridConstraints(6, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        salaLabel = new JLabel();
        Font salaLabelFont = this.getFont(null, Font.BOLD, 16, salaLabel.getFont());
        if (salaLabelFont != null) salaLabel.setFont(salaLabelFont);
        salaLabel.setForeground(new Color(-15506496));
        salaLabel.setText("Label");
        panel3.add(salaLabel, new GridConstraints(7, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JPanel panel4 = new JPanel();
        panel4.setLayout(new GridLayoutManager(1, 1, new Insets(30, 20, 0, 20), -1, -1));
        panel3.add(panel4, new GridConstraints(8, 0, 1, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, new Dimension(-1, 10), null, 0, false));
        confirmarIncriçãoButton = new JButton();
        confirmarIncriçãoButton.setBackground(new Color(-13684426));
        confirmarIncriçãoButton.setBorderPainted(false);
        confirmarIncriçãoButton.setFocusable(false);
        Font confirmarIncriçãoButtonFont = this.getFont(null, Font.BOLD, 16, confirmarIncriçãoButton.getFont());
        if (confirmarIncriçãoButtonFont != null) confirmarIncriçãoButton.setFont(confirmarIncriçãoButtonFont);
        confirmarIncriçãoButton.setForeground(new Color(-1));
        confirmarIncriçãoButton.setText("Confirmar Incrição");
        panel4.add(confirmarIncriçãoButton, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));

        this.confirmarIncriçãoButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        this.voltarButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        ShowItemList(SystemController.listaPanelAulasTeoricasDisponiveis(), mainPanel);
        mainLista.setBackground(Color.white);
        scrollPanel.setBackground(Color.white);

        mainPanel.add(mainLista, "0");
        mainPanel.add(mainInfo, "1");
        cl = (CardLayout) (mainPanel.getLayout());
        cl.show(mainPanel, "0");

        voltarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainPanel.add(new FragmentInscreverAulas().$$$getRootComponent$$$(), "0");
                cl = (CardLayout) (mainPanel.getLayout());
                cl.show(mainPanel, "0");
            }
        });

        confirmarIncriçãoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                SystemController.adicionarAulaAluno(SystemController.getAulaSelecionada());
                mainPanel.add(new FragmentInscreverAulas().$$$getRootComponent$$$(), "0");
                cl = (CardLayout) (mainPanel.getLayout());
                cl.show(mainPanel, "0");
            }
        });

    }

    private Font getFont(String fontName, int style, int size, Font currentFont) {
        if (currentFont == null) return null;
        String resultName;
        if (fontName == null) {
            resultName = currentFont.getName();
        } else {
            Font testFont = new Font(fontName, Font.PLAIN, 10);
            if (testFont.canDisplay('a') && testFont.canDisplay('1')) {
                resultName = fontName;
            } else {
                resultName = currentFont.getName();
            }
        }
        Font font = new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
        boolean isMac = System.getProperty("os.name", "").toLowerCase(Locale.ENGLISH).startsWith("mac");
        Font fontWithFallback = isMac ? new Font(font.getFamily(), font.getStyle(), font.getSize()) : new StyleContext().getFont(font.getFamily(), font.getStyle(), font.getSize());
        return fontWithFallback instanceof FontUIResource ? fontWithFallback : new FontUIResource(fontWithFallback);
    }

    public void setLabelsAula(AulaTeorica x) {
        this.dataLabel.setText(x.getData());
        this.horarioLabel.setText(x.getHorario());
        this.disciplinaLabel.setText(x.getDisciplina().getNome());
        this.cargaLabel.setText(x.getCargaHoraria());
        this.capacidadeLabel.setText(String.valueOf(x.capacidadeAula()));
        this.professorLabel.setText(x.getNomeInstrutor());
        this.códigoLabel.setText(x.getDisciplina().getCodigo());
        this.salaLabel.setText(String.valueOf(x.getSala()));
    }

    public void ShowItemList(List<PanelAulas> paneList, JPanel container) {

        DefaultListModel model = new DefaultListModel();

        for (PanelAulas panel : paneList) {
            model.addElement(panel);
        }

        listaAulas.setModel(model);
        listaAulas.setFixedCellHeight(40);
        listaAulas.setSelectedIndex(-1);
        listaAulas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        listaAulas.setCellRenderer(new PanelRenderer());
        listaAulas.setBorder(null);
        scrollPanel.setBorder(null);
    }

    class PanelRenderer implements ListCellRenderer {
        @Override
        public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
            PanelAulas renderer = (PanelAulas) value;
            renderer.mainPainel.setBackground(cellHasFocus ? Color.red : list.getBackground());
            if (isSelected) {
                SystemController.setAulaSelecionada(renderer.getAulaTeorica());
                setLabelsAula(SystemController.getAulaSelecionada());
                cl.show(mainPanel, "1");
            }

            return renderer.$$$getRootComponent$$$();
        }
    }


    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        mainPanel = new JPanel();
        mainPanel.setLayout(new CardLayout(0, 0));
        mainPanel.setBackground(new Color(-14671323));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return mainPanel;
    }

}


