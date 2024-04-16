/**
 * Cette classe représente l'interface graphique de l'application GeoAnalytique.
 * Elle permet à l'utilisateur de dessiner différentes formes géométriques et d'effectuer des opérations sur celles-ci.
 * La fenêtre principale contient un menu, des boutons, un menu déroulant pour sélectionner la forme à dessiner,
 * ainsi qu'un panneau pour afficher les dessins.
 */
package geoanalytique.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class GeoAnalytiqueGui extends JFrame {

    /**
     * Liste des options originales dans le menu déroulant.
     */
    private final List<String> originalOptions;

    /**
     * Panneau supérieur de l'interface.
     */
    private JPanel topPanel;

    /**
     * Constructeur par défaut de la classe GeoAnalytiqueGui.
     * Initialise la liste des options originales et initialise l'interface
     * utilisateur.
     */
    public GeoAnalytiqueGui() {
        originalOptions = new ArrayList<>();
        initUI();
    }

    /**
     * Initialise l'interface utilisateur en configurant les composants graphiques
     * et en ajoutant les gestionnaires d'événements.
     */
    private void initUI() {
        setTitle("Mini Projet GeoAnalityque");
        setPreferredSize(new Dimension(1400, 1200));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("Menu");
        JMenuItem newMenuItem = new JMenuItem("Nouveau");
        JMenuItem openMenuItem = new JMenuItem("Ouvrir");
        JMenuItem saveMenuItem = new JMenuItem("Enregistrer");
        JMenuItem qMenuItem = new JMenuItem("Quitter");

        fileMenu.add(newMenuItem);
        fileMenu.add(openMenuItem);
        fileMenu.add(saveMenuItem);
        fileMenu.add(qMenuItem);
        menuBar.add(fileMenu);
        setJMenuBar(menuBar);

        JPanel mainPanel = new JPanel(new BorderLayout());
        topPanel = new JPanel();
        JPanel bottomPanel = new JPanel();

        ImageIcon penIcon = new ImageIcon(getClass().getResource("./img/pen.png"));
        ImageIcon deleteIcon = new ImageIcon(getClass().getResource("./img/del.png"));

        JButton deleteButton = new JButton(deleteIcon);

        topPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        topPanel.add(Box.createRigidArea(new Dimension(30, 0)));
        topPanel.add(new JLabel(penIcon));
        topPanel.add(deleteButton);

        JButton drawButton = new JButton("Dessiner");
        drawButton.setPreferredSize(new Dimension(100, 30));
        drawButton.setBackground(new Color(128, 0, 0));
        drawButton.setForeground(Color.WHITE);
        drawButton.setFocusPainted(false);
        drawButton.setFont(new Font("Arial", Font.BOLD, 14));
        topPanel.add(drawButton);

        JComboBox<String> shapeOptions = new JComboBox<>();
        shapeOptions.setPreferredSize(new Dimension(100, 30));
        shapeOptions.setBackground(new Color(173, 216, 230));
        shapeOptions.setForeground(Color.WHITE);
        shapeOptions.setFont(new Font("Arial", Font.BOLD, 15));

        shapeOptions.addItem("Carre");
        shapeOptions.addItem("Rectangle");
        shapeOptions.addItem("Cercle");
        shapeOptions.addItem("Point");
        shapeOptions.addItem("Losange");
        shapeOptions.addItem("Triangle");
        shapeOptions.addItem("Droite");
        shapeOptions.addItem("Segment");

        for (int i = 0; i < shapeOptions.getItemCount(); i++) {
            originalOptions.add(shapeOptions.getItemAt(i));
        }

        topPanel.add(shapeOptions);
        topPanel.setBackground(new Color(135, 206, 250));
        topPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        mainPanel.add(topPanel, BorderLayout.NORTH);
        mainPanel.add(bottomPanel, BorderLayout.CENTER);

        add(mainPanel);

        newMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                GeoAnalytiqueGui newWindow = new GeoAnalytiqueGui();
                newWindow.setVisible(true);
            }
        });
        openMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int returnValue = fileChooser.showOpenDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    JOptionPane.showMessageDialog(null, "Ouverture du fichier : " + selectedFile.getName());
                }
            }
        });

        saveMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Enregistrement du fichier");
            }
        });

        qMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int choice = JOptionPane.showConfirmDialog(null, "Êtes-vous sûr de vouloir quitter ?", "Confirmation",
                        JOptionPane.YES_NO_OPTION);
                if (choice == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });

        drawButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedOption = (String) shapeOptions.getSelectedItem();
                switch (selectedOption) {
                    case "Carre":
                        String side = JOptionPane.showInputDialog(null, "Entrez la longueur du côté du carré:");
                        JOptionPane.showMessageDialog(null, "Nous allons tracer un carré de côté : " + side);
                        break;
                    case "Rectangle":
                        String length = JOptionPane.showInputDialog(null, "Entrez la longueur du rectangle:");
                        String width = JOptionPane.showInputDialog(null, "Entrez la largeur du rectangle:");
                        JOptionPane.showMessageDialog(null,
                                "Nous allons tracer un rectangle de longueur : " + length + " et de largeur : "
                                        + width);
                        break;
                    case "Cercle":
                        String centerX = JOptionPane.showInputDialog(null,
                                "Entrez la coordonnée X du centre du cercle:");
                        String centerY = JOptionPane.showInputDialog(null,
                                "Entrez la coordonnée Y du centre du cercle:");
                        String radius = JOptionPane.showInputDialog(null, "Entrez le rayon du cercle:");
                        JOptionPane.showMessageDialog(null,
                                "Nous allons tracer un cercle avec le centre (" + centerX + ", " + centerY
                                        + ") et un rayon de : " + radius);
                        break;
                    case "Point":
                        String pointX = JOptionPane.showInputDialog(null, "Entrez la coordonnée X du point:");
                        String pointY = JOptionPane.showInputDialog(null, "Entrez la coordonnée Y du point:");
                        JOptionPane.showMessageDialog(null,
                                "Nous allons tracer un point avec les coordonnées (" + pointX + ", " + pointY + ")");
                        break;
                    case "Losange":
                        String sideLosange = JOptionPane.showInputDialog(null,
                                "Entrez la longueur du côté du losange:");
                        JOptionPane.showMessageDialog(null, "Nous allons tracer un losange de côté : " + sideLosange);
                        break;
                    case "Triangle":
                        String side1 = JOptionPane.showInputDialog(null,
                                "Entrez la longueur du premier côté du triangle:");
                        String side2 = JOptionPane.showInputDialog(null,
                                "Entrez la longueur du deuxième côté du triangle:");
                        String side3 = JOptionPane.showInputDialog(null,
                                "Entrez la longueur du troisième côté du triangle:");
                        JOptionPane.showMessageDialog(null,
                                "Nous allons tracer un triangle avec des côtés de longueur : " + side1 + ", " + side2
                                        + ", " + side3);
                        break;
                    case "Droite":
                        String x1 = JOptionPane.showInputDialog(null,
                                "Entrez la coordonnée X du premier point de la droite:");
                        String y1 = JOptionPane.showInputDialog(null,
                                "Entrez la coordonnée Y du premier point de la droite:");
                        String x2 = JOptionPane.showInputDialog(null,
                                "Entrez la coordonnée X du deuxième point de la droite:");
                        String y2 = JOptionPane.showInputDialog(null,
                                "Entrez la coordonnée Y du deuxième point de la droite:");
                        JOptionPane.showMessageDialog(null, "Nous allons tracer une droite avec les points (" + x1
                                + ", " + y1 + ") et (" + x2 + ", " + y2 + ")");
                        break;
                    case "Segment":
                        String x1_seg = JOptionPane.showInputDialog(null,
                                "Entrez la coordonnée X du premier point du segment:");
                        String y1_seg = JOptionPane.showInputDialog(null,
                                "Entrez la coordonnée Y du premier point du segment:");
                        String x2_seg = JOptionPane.showInputDialog(null,
                                "Entrez la coordonnée X du deuxième point du segment:");
                        String y2_seg = JOptionPane.showInputDialog(null,
                                "Entrez la coordonnée Y du deuxième point du segment:");
                        JOptionPane.showMessageDialog(null, "Nous allons tracer un segment avec les points (" + x1_seg
                                + ", " + y1_seg + ") et (" + x2_seg + ", " + y2_seg + ")");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Fonctionnalité non prise en charge pour cette forme.");
                        break;
                }
            }
        });

        pack();
        setLocationRelativeTo(null);
    }
}
