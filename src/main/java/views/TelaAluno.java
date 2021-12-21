package views;

import Util.ColorSystem;
import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;
import controllers.SystemController;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.RoundRectangle2D;

public class TelaAluno extends JFrame {

    private JPanel mainPainel;
    private JPanel areaAluno;
    private JPanel areaFragment;
    private JButton sairButton;
    private JLabel gradeDeHorariosLabel;
    private JLabel cadastroEmAulasLabel;
    private JLabel cargaHorariaLabel;
    private JLabel agendamentoDeProvasLabel;
    private JLabel nomeDoUsuarioLabel;
    private JLabel matriculaLabel;
    private JLabel fotoUser;
    private JLabel fotoExit;
    private CardLayout cl;

    private JLabel selecionado = new JLabel();
    ImageIcon logoIcon = new ImageIcon("src\\main\\resources\\images\\logo.png");

    public TelaAluno() throws HeadlessException {

        configFrame();
        configFragment();
        configOpcoes();
        eventClick();

        this.fotoUser.setIcon(SystemController.fotoUser());
        this.nomeDoUsuarioLabel.setText(SystemController.nameUser());
        this.matriculaLabel.setText(SystemController.matriculaUser());
    }

    public void configFrame() {

        //Configuracao JFrame
        this.setUndecorated(true);
        this.setForeground(ColorSystem.backgroundSystem());
        this.setContentPane(mainPainel);
        this.pack();
        this.setVisible(true);
        this.setLocation(200, 70);
        this.setSize(1000, 600);
        this.setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 15, 15));
    }

    public void configFragment() {

        JPanel logoPanel = new JPanel(new BorderLayout());
        JLabel logo = new JLabel();
        logo.setIcon(logoIcon);
        logo.setHorizontalAlignment(SwingConstants.HORIZONTAL);
        logoPanel.add(logo);

        areaFragment.add(logoPanel, "1");
        cl = (CardLayout) (areaFragment.getLayout());
        cl.show(areaFragment, "Logo");
    }

    public void configOpcoes() {

        Font fonte = new Font("Roboto", Font.BOLD, 16);

        this.gradeDeHorariosLabel.setFont(fonte);
        this.cargaHorariaLabel.setFont(fonte);
        this.cadastroEmAulasLabel.setFont(fonte);
        this.agendamentoDeProvasLabel.setFont(fonte);

        this.sairButton.setFont(new Font("Roboto", Font.BOLD, 16));
        this.nomeDoUsuarioLabel.setFont(new Font("Arial", Font.BOLD, 15));
        this.matriculaLabel.setFont(new Font("Arial", Font.BOLD, 15));

        this.gradeDeHorariosLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        this.cargaHorariaLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        this.cadastroEmAulasLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        this.agendamentoDeProvasLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        this.sairButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        this.fotoExit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }

    public void eventClick() {
        sairButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        gradeDeHorariosLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                selecionado.setForeground(Color.WHITE);
                gradeDeHorariosLabel.setForeground(ColorSystem.backgroundMenuClick());
                areaFragment.add(new FragmentGrade().$$$getRootComponent$$$(), "2");
                selecionado = gradeDeHorariosLabel;
                cl.show(areaFragment, "2");
            }
        });
        cadastroEmAulasLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                selecionado.setForeground(Color.WHITE);
                cadastroEmAulasLabel.setForeground(ColorSystem.backgroundMenuClick());
                areaFragment.add(new FragmentInscreverAulas().$$$getRootComponent$$$(), "3");
                selecionado = cadastroEmAulasLabel;
                cl.show(areaFragment, "3");
            }
        });
        cargaHorariaLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                selecionado.setForeground(Color.WHITE);
                cargaHorariaLabel.setForeground(ColorSystem.backgroundMenuClick());
                areaFragment.add(new FragmentVisualizarInformacoes(SystemController.dadosAluno()).$$$getRootComponent$$$(), "4");
                selecionado = cargaHorariaLabel;
                cl.show(areaFragment, "4");
            }
        });
        agendamentoDeProvasLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                selecionado.setForeground(Color.WHITE);
                agendamentoDeProvasLabel.setForeground(ColorSystem.backgroundMenuClick());
                areaFragment.add(new FragmentSolicitarAgendamento().$$$getRootComponent$$$(), "5");
                selecionado = agendamentoDeProvasLabel;
                cl.show(areaFragment, "5");
            }
        });

        fotoExit.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }
        });

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
        mainPainel = new JPanel();
        mainPainel.setLayout(new GridLayoutManager(2, 2, new Insets(0, 0, 0, 0), 6, -1));
        mainPainel.setBackground(new Color(-14671323));
        mainPainel.setMinimumSize(new Dimension(10, 10));
        mainPainel.setVisible(true);
        areaAluno = new JPanel();
        areaAluno.setLayout(new GridLayoutManager(3, 1, new Insets(10, 10, 10, 10), -1, -1));
        areaAluno.setAlignmentX(0.5f);
        areaAluno.setBackground(new Color(-13684426));
        mainPainel.add(areaAluno, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        panel1.setBackground(new Color(-13684426));
        areaAluno.add(panel1, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        sairButton = new JButton();
        sairButton.setBackground(new Color(-15506496));
        sairButton.setBorderPainted(false);
        sairButton.setContentAreaFilled(true);
        sairButton.setFocusPainted(true);
        sairButton.setFocusable(false);
        sairButton.setForeground(new Color(-1));
        sairButton.setOpaque(true);
        sairButton.setRequestFocusEnabled(true);
        sairButton.setRolloverEnabled(true);
        sairButton.setText("Sair");
        sairButton.setVerifyInputWhenFocusTarget(true);
        panel1.add(sairButton, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(60, -1), null, 0, false));
        final JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayoutManager(3, 1, new Insets(0, 0, 70, 0), -1, -1));
        panel2.setBackground(new Color(-13684426));
        areaAluno.add(panel2, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        nomeDoUsuarioLabel = new JLabel();
        nomeDoUsuarioLabel.setForeground(new Color(-1));
        nomeDoUsuarioLabel.setText("Nome do Usuário");
        panel2.add(nomeDoUsuarioLabel, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        matriculaLabel = new JLabel();
        matriculaLabel.setForeground(new Color(-1));
        matriculaLabel.setText("Matrícula");
        panel2.add(matriculaLabel, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JPanel panel3 = new JPanel();
        panel3.setLayout(new GridLayoutManager(1, 1, new Insets(20, 0, 10, 0), -1, -1));
        panel3.setBackground(new Color(-13684426));
        panel2.add(panel3, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, new Dimension(-1, 30), null, 0, false));
        fotoUser = new JLabel();
        fotoUser.setText("");
        panel3.add(fotoUser, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JPanel panel4 = new JPanel();
        panel4.setLayout(new GridLayoutManager(5, 2, new Insets(0, 0, 0, 0), -1, -1));
        panel4.setBackground(new Color(-13684426));
        areaAluno.add(panel4, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, new Dimension(24, 600), null, 0, false));
        final JPanel panel5 = new JPanel();
        panel5.setLayout(new GridLayoutManager(1, 1, new Insets(0, 5, 0, 0), -1, -1));
        panel5.setBackground(new Color(-13684426));
        panel5.setForeground(new Color(-13684426));
        panel4.add(panel5, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, new Dimension(-1, 37), null, 0, false));
        gradeDeHorariosLabel = new JLabel();
        gradeDeHorariosLabel.setBackground(new Color(-13684426));
        gradeDeHorariosLabel.setForeground(new Color(-1));
        gradeDeHorariosLabel.setText("Grade de horários");
        panel5.add(gradeDeHorariosLabel, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_VERTICAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer1 = new Spacer();
        panel4.add(spacer1, new GridConstraints(4, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        final JPanel panel6 = new JPanel();
        panel6.setLayout(new GridLayoutManager(1, 1, new Insets(0, 5, 0, 0), -1, -1));
        panel6.setBackground(new Color(-13684426));
        panel6.setForeground(new Color(-13684426));
        panel4.add(panel6, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, new Dimension(-1, 37), null, 0, false));
        cadastroEmAulasLabel = new JLabel();
        cadastroEmAulasLabel.setBackground(new Color(-13684426));
        cadastroEmAulasLabel.setForeground(new Color(-1));
        cadastroEmAulasLabel.setText("Inscrição em aulas");
        panel6.add(cadastroEmAulasLabel, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_VERTICAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JPanel panel7 = new JPanel();
        panel7.setLayout(new GridLayoutManager(1, 1, new Insets(0, 5, 0, 0), -1, -1));
        panel7.setBackground(new Color(-13684426));
        panel7.setForeground(new Color(-13684426));
        panel4.add(panel7, new GridConstraints(2, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, new Dimension(-1, 37), null, 0, false));
        cargaHorariaLabel = new JLabel();
        cargaHorariaLabel.setBackground(new Color(-13684426));
        cargaHorariaLabel.setForeground(new Color(-1));
        cargaHorariaLabel.setText("Visualizar informações");
        panel7.add(cargaHorariaLabel, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_VERTICAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JPanel panel8 = new JPanel();
        panel8.setLayout(new GridLayoutManager(1, 1, new Insets(0, 5, 0, 0), -1, -1));
        panel8.setBackground(new Color(-13684426));
        panel8.setForeground(new Color(-13684426));
        panel4.add(panel8, new GridConstraints(3, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, new Dimension(-1, 37), null, 0, false));
        agendamentoDeProvasLabel = new JLabel();
        agendamentoDeProvasLabel.setBackground(new Color(-13684426));
        agendamentoDeProvasLabel.setForeground(new Color(-1));
        agendamentoDeProvasLabel.setText("Agendamento de provas");
        panel8.add(agendamentoDeProvasLabel, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_VERTICAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label1 = new JLabel();
        label1.setIcon(new ImageIcon(getClass().getResource("/icons/iconAppointment.png")));
        label1.setText("");
        panel4.add(label1, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label2 = new JLabel();
        label2.setIcon(new ImageIcon(getClass().getResource("/icons/iconPen.png")));
        label2.setText("");
        panel4.add(label2, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label3 = new JLabel();
        label3.setIcon(new ImageIcon(getClass().getResource("/icons/iconExame.png")));
        label3.setText("");
        panel4.add(label3, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label4 = new JLabel();
        label4.setIcon(new ImageIcon(getClass().getResource("/icons/iconProfile.png")));
        label4.setText("");
        panel4.add(label4, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        areaFragment = new JPanel();
        areaFragment.setLayout(new CardLayout(0, 0));
        areaFragment.setAlignmentX(0.5f);
        areaFragment.setBackground(new Color(-1));
        areaFragment.setVisible(true);
        mainPainel.add(areaFragment, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, new Dimension(690, -1), null, 0, false));
        final JPanel panel9 = new JPanel();
        panel9.setLayout(new GridLayoutManager(1, 1, new Insets(5, 0, 0, 7), -1, -1));
        panel9.setBackground(new Color(-14671323));
        mainPainel.add(panel9, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        fotoExit = new JLabel();
        fotoExit.setAlignmentY(0.5f);
        fotoExit.setForeground(new Color(-1));
        fotoExit.setIcon(new ImageIcon(getClass().getResource("/images/iconExit.png")));
        fotoExit.setText("");
        panel9.add(fotoExit, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_EAST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return mainPainel;
    }

}