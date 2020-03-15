package codewars.com.structures.navigationstack;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Windows.
 */
public class NavigateWindows extends JFrame implements ActionListener {

    private JLabel jLabelUndo;
    private JLabel jLabelRedo;
    private JLabel jLabelAdd;
    private JLabel jLabelText;
    private JTextField jTextField;
    private JButton jButtonUndo;
    private JButton jButtonRedo;
    private JButton jButtonAdd;
    private JScrollPane jScrollPane;
    private DefaultListModel listModel;
    private JList jList;
    private JScrollPane scrollPane = new JScrollPane();
    private Navigation navigation;

    /**
     * Constructor.
     */
    public NavigateWindows() {
        super();                   // usamos el contructor de la clase padre JFrame
        navigation = new Navigation<String>();
        windowsConfiguration();    // configuramos la ventana
        startComponents();         // inicializamos los atributos o componentes
        setSizePositionComponents();
        addListenerToComponents();
        setToWindowsComponents();
    }

    /**
     * Windows configuration.
     */
    private void windowsConfiguration() {
        this.setTitle("Navigation Stack"); // colocamos titulo a la ventana
        final int width = 640;
        final int height = 480;
        this.setSize(width, height); // colocamos tamanio a la ventana (ancho, alto)
        this.setLocationRelativeTo(null); // centramos la ventana en la pantalla
        this.setLayout(null); // no usamos ningun layout, solo asi podremos dar posiciones a los componentes
        this.setResizable(false); // hacemos que la ventana no sea redimiensionable
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // hacemos que cuando se cierre la ventana termina todo.
    }

    /**
     * The method Creates a components.
     * then configure all components.
     */
    private void startComponents() {
        // start all labels
        jLabelAdd = new JLabel("Add");
        jLabelUndo = new JLabel("Undo");
        jLabelRedo = new JLabel("Redo");
        jLabelText = new JLabel("Text");
        // start all buttons
        jButtonAdd = new JButton("Add");
        jButtonUndo = new JButton("Undo");
        jButtonRedo = new JButton("Redo");
        // start all text field
        jTextField = new JTextField("Example");
        // start list model.
        listModel = new DefaultListModel<String>();
        jList = new JList();
        scrollPane = new JScrollPane();
    }

    /**
     * Set size and position of all components.
     */
    private void setSizePositionComponents() {
        // colocamos position(x, y) y tamano (x, y, ancho, alto)
        // position and size of all Labels.
        final int sixtyFour = 64;
        final int hTwentyEight = 128;
        final int hNinetyTwo = 192;
        final int ninetySix = 96;
        final int fortyEight = 48;
        final int twentyFour = 24;
        final int thirtyTwo = 32;
        final int threeHundredTwenty = 320;
        final int twoHundredForty = 240;
        jLabelAdd.setBounds(sixtyFour, thirtyTwo, hNinetyTwo, fortyEight);
        jLabelUndo.setBounds(sixtyFour, sixtyFour, hNinetyTwo, fortyEight);
        jLabelRedo.setBounds(sixtyFour, ninetySix, hNinetyTwo, fortyEight);
        jLabelText.setBounds(sixtyFour, hTwentyEight, hNinetyTwo, fortyEight);
        // position an size of all buttons.
        jButtonAdd.setBounds(hTwentyEight, thirtyTwo, ninetySix, twentyFour);
        jButtonUndo.setBounds(hTwentyEight, sixtyFour, ninetySix, twentyFour);
        jButtonRedo.setBounds(hTwentyEight, ninetySix, ninetySix, twentyFour);
        // set position textField or text box.
        jTextField.setBounds(hTwentyEight, hTwentyEight, ninetySix, twentyFour);
        scrollPane.setBounds(twoHundredForty, thirtyTwo, threeHundredTwenty, twoHundredForty);
    }

    /**
     * addListenerToComponents.
     */
    private void addListenerToComponents() {
        // hacemos que los JButtons tengan una accion y esa accion estara en esta clase.
        jButtonAdd.addActionListener(this);
        jButtonUndo.addActionListener(this);
        jButtonRedo.addActionListener(this);
    }

    /**
     * setToWindowsComponents.
     */
    private void setToWindowsComponents() {
        // adicionamos los componentes a la ventana
        this.add(jLabelAdd);
        this.add(jLabelUndo);
        this.add(jLabelRedo);
        this.add(jLabelText);
        this.add(jButtonAdd);
        this.add(jButtonUndo);
        this.add(jButtonRedo);
        this.add(jTextField);
        this.add(scrollPane);

    }

    /**
     * @param e event.
     */
    @Override
    @SuppressWarnings("unchecked")
    public void actionPerformed(final ActionEvent e) {
        if (e.getSource() == jButtonAdd) {
            String element = jTextField.getText();
            navigation.add(element);
            showElements();
        } else if (e.getSource() == jButtonUndo) {
            navigation.undo();
            showElements();
        } else if (e.getSource() == jButtonRedo) {
            navigation.redo();
            showElements();
        }

    }

    /**
     * showElements.
     */
    @SuppressWarnings("unchecked")
    public void showElements() {
        listModel.removeAllElements();
        for (Object elementValue : navigation.getArrayOfElements()) {
            listModel.addElement(elementValue);
        }
        jList.setModel(listModel);
        scrollPane.setViewportView(jList);
    }

}
