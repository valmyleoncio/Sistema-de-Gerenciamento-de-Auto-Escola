package views;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import entities.AulaTeorica;

import javax.swing.*;
import java.awt.*;

public class PanelAulasAluno {
    private JPanel panel1;
    private JLabel dataLabel;
    private JLabel horaLabel;
    private JLabel cargaHoráriaLabel;
    private JLabel disciplinaLabel;
    private JLabel professorLabel;
    private JLabel salaLabel;
    public JPanel panelColor;

    public PanelAulasAluno(AulaTeorica aula) {

        this.dataLabel.setText(aula.getData());
        this.horaLabel.setText(aula.getHorario());
        this.cargaHoráriaLabel.setText(aula.getCargaHoraria());
        this.disciplinaLabel.setText(aula.getDisciplina().getNome());
        this.professorLabel.setText(aula.getNomeInstrutor());
        this.salaLabel.setText(String.valueOf(aula.getSala()));
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
        panel1 = new JPanel();
        panel1.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 3, 0), -1, -1));
        panel1.setBackground(new Color(-1));
        panel1.setMinimumSize(new Dimension(40, 10));
        panel1.setPreferredSize(new Dimension(40, 20));
        panelColor = new JPanel();
        panelColor.setLayout(new GridLayoutManager(1, 6, new Insets(0, 0, 0, 0), -1, -1));
        panelColor.setBackground(new Color(-13684426));
        panel1.add(panelColor, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        dataLabel = new JLabel();
        dataLabel.setForeground(new Color(-1));
        dataLabel.setText("Data");
        panelColor.add(dataLabel, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        horaLabel = new JLabel();
        horaLabel.setForeground(new Color(-1));
        horaLabel.setText("Hora");
        panelColor.add(horaLabel, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        cargaHoráriaLabel = new JLabel();
        cargaHoráriaLabel.setForeground(new Color(-1));
        cargaHoráriaLabel.setText("Carga Horária");
        panelColor.add(cargaHoráriaLabel, new GridConstraints(0, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        disciplinaLabel = new JLabel();
        disciplinaLabel.setForeground(new Color(-1));
        disciplinaLabel.setText("Disciplina");
        panelColor.add(disciplinaLabel, new GridConstraints(0, 3, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        professorLabel = new JLabel();
        professorLabel.setForeground(new Color(-1));
        professorLabel.setText("Professor");
        panelColor.add(professorLabel, new GridConstraints(0, 4, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        salaLabel = new JLabel();
        salaLabel.setForeground(new Color(-1));
        salaLabel.setText("sala");
        panelColor.add(salaLabel, new GridConstraints(0, 5, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return panel1;
    }

}
