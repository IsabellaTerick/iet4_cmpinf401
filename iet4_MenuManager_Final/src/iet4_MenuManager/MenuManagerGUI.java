package iet4_MenuManager;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

/**
 * Class Menu Manager
 * @author Isabella
 * created 12/2/2022
 */
public class MenuManagerGUI 
{

	//creating graphics for main window
	private JFrame mainMenuWindow;
	private JLabel lblBuildMenu, lblEntree, lblSide, lblSalad, lblDessert, lblGenMenu, lblCreatedMenu;
	private JComboBox cboEntree, cboSide, cboSalad, cboDessert;
	private JList listMenus;
	private JButton btnCreateMenu, btnRandomMenu, btnMinCalMenu, btnMaxCalMenu, btnDetails, btnDelete, btnSaveToFile;

	//creating graphics for secondary window
	private JFrame secMenuWindow;
	private JLabel lblEntree2, lblSide2, lblSalad2, lblDessert2, lblTotalCal, lblTotalPrice;
	private JTextArea txtEntree, txtSide, txtSalad, txtDessert, txtCal, txtPrice;
	private JTextField test;

	//creating MenuManger object & creating arrayList to store menus
	private MenuManager menuManager;
	ArrayList<Menu> menuArrayList = new ArrayList<Menu>();

	/**
	 * constructor MenuManagerGUI
	 */
	public MenuManagerGUI()
	{
		//creating MenuManager object & loads data from the file
		menuManager = new MenuManager("data\\dishes.txt");
	
		//calls method that builds MainMenu
		buildMainWindow();
	}

	/**
	 * method buildMainWindow
	 */
	private void buildMainWindow()
	{
		//main window
		mainMenuWindow = new JFrame("Menu Manager");
		mainMenuWindow.setBounds(20, 20, 1200, 1000);
		mainMenuWindow.setLayout(null);

		//adding labels
		lblBuildMenu = new JLabel("Build your own Menu");
		lblBuildMenu.setBounds(70, 30, 200, 50);
		lblBuildMenu.setFont(new Font("Serif", Font.PLAIN, 20));
		mainMenuWindow.getContentPane().add(lblBuildMenu);

		lblEntree = new JLabel("Entree");
		lblEntree.setBounds(90, 90, 200, 50);
		lblEntree.setFont(new Font("Serif", Font.PLAIN, 20));
		mainMenuWindow.getContentPane().add(lblEntree);

		lblSide = new JLabel("Side");
		lblSide.setBounds(90, 170, 200, 50);
		lblSide.setFont(new Font("Serif", Font.PLAIN, 20));
		mainMenuWindow.getContentPane().add(lblSide);

		lblSalad = new JLabel("Salad");
		lblSalad.setBounds(90, 250, 200, 50);
		lblSalad.setFont(new Font("Serif", Font.PLAIN, 20));
		mainMenuWindow.getContentPane().add(lblSalad);

		lblDessert = new JLabel("Dessert");
		lblDessert.setBounds(90, 330, 200, 50);
		lblDessert.setFont(new Font("Serif", Font.PLAIN, 20));
		mainMenuWindow.getContentPane().add(lblDessert);

		lblGenMenu = new JLabel("Or generate a Menu");
		lblGenMenu.setBounds(70, 540, 200, 50);
		lblGenMenu.setFont(new Font("Serif", Font.PLAIN, 20));
		mainMenuWindow.getContentPane().add(lblGenMenu);

		lblCreatedMenu = new JLabel("Created Menus:");
		lblCreatedMenu.setBounds(620, 30, 200, 50);
		lblCreatedMenu.setFont(new Font("Serif", Font.PLAIN, 20));
		mainMenuWindow.getContentPane().add(lblCreatedMenu);

		//adding combo boxes
		cboEntree = new JComboBox(menuManager.getEntrees().toArray());
		cboEntree.setBounds(270, 100, 240, 40);
		cboEntree.setFont(new Font("Serif", Font.PLAIN, 20));
		mainMenuWindow.getContentPane().add(cboEntree);

		cboSide = new JComboBox(menuManager.getSides().toArray());
		cboSide.setBounds(270, 180, 240, 40);
		cboSide.setFont(new Font("Serif", Font.PLAIN, 20));
		mainMenuWindow.getContentPane().add(cboSide);

		cboSalad = new JComboBox(menuManager.getSalads().toArray());
		cboSalad.setBounds(270, 260, 240, 40);
		cboSalad.setFont(new Font("Serif", Font.PLAIN, 20));
		mainMenuWindow.getContentPane().add(cboSalad);

		cboDessert = new JComboBox(menuManager.getDesserts().toArray());
		cboDessert.setBounds(270, 340, 240, 40);
		cboDessert.setFont(new Font("Serif", Font.PLAIN, 20));
		mainMenuWindow.getContentPane().add(cboDessert);

		//adding list
		DefaultListModel listModel = new DefaultListModel();
		listMenus = new JList(listModel);
		listMenus.setBounds(620, 100, 500, 700);
		listMenus.setFont(new Font("Serif", Font.PLAIN, 20));
		mainMenuWindow.getContentPane().add(listMenus);

		//adding buttons
		btnCreateMenu = new JButton("Create Menu with these dishes");
		btnCreateMenu.setBounds(120, 450, 350, 50);
		btnCreateMenu.setFont(new Font("Serif", Font.PLAIN, 20));
		mainMenuWindow.getContentPane().add(btnCreateMenu);

		btnRandomMenu = new JButton("Generate a Random Menu");
		btnRandomMenu.setBounds(120, 630, 350, 50);
		btnRandomMenu.setFont(new Font("Serif", Font.PLAIN, 20));
		mainMenuWindow.getContentPane().add(btnRandomMenu);

		btnMinCalMenu = new JButton("Generate a Minimum Calories Menu");
		btnMinCalMenu.setBounds(120, 720, 350, 50);
		btnMinCalMenu.setFont(new Font("Serif", Font.PLAIN, 20));
		mainMenuWindow.getContentPane().add(btnMinCalMenu);

		btnMaxCalMenu = new JButton("Generate a Maximum Calories Menu");
		btnMaxCalMenu.setBounds(120, 810, 350, 50);
		btnMaxCalMenu.setFont(new Font("Serif", Font.PLAIN, 20));
		mainMenuWindow.getContentPane().add(btnMaxCalMenu);

		btnDetails = new JButton("Details");
		btnDetails.setBounds(620, 850, 150, 50);
		btnDetails.setFont(new Font("Serif", Font.PLAIN, 20));
		mainMenuWindow.getContentPane().add(btnDetails);

		btnDelete = new JButton("Delete all");
		btnDelete.setBounds(795, 850, 150, 50);
		btnDelete.setFont(new Font("Serif", Font.PLAIN, 20));
		mainMenuWindow.getContentPane().add(btnDelete);

		btnSaveToFile = new JButton("Save to File");
		btnSaveToFile.setBounds(970, 850, 150, 50);
		btnSaveToFile.setFont(new Font("Serif", Font.PLAIN, 20));
		mainMenuWindow.getContentPane().add(btnSaveToFile);

		//adding event handlers
		//create chosen menu
		btnCreateMenu.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				String name = JOptionPane.showInputDialog("Please enter a name for the menu.");
				Menu temp = new Menu(name, (Entree)cboEntree.getSelectedItem(), (Side)cboSide.getSelectedItem(), (Salad)cboSalad.getSelectedItem(), (Dessert)cboDessert.getSelectedItem());
				menuArrayList.add(temp);
				listModel.addElement(temp);
			}
		});

		//create random menu
		btnRandomMenu.addActionListener(new ActionListener () 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				String name = JOptionPane.showInputDialog("Please enter a name for the menu.");
				Menu temp = menuManager.randomMenu(name);
				menuArrayList.add(temp);
				listModel.addElement(temp);
			}
		});

		//create min calorie menu
		btnMinCalMenu.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				String name = JOptionPane.showInputDialog("Please enter a name for the menu.");
				Menu temp = menuManager.minCaloriesMenu(name);
				menuArrayList.add(temp);
				listModel.addElement(temp);
			}
		});

		//create max calorie menu
		btnMaxCalMenu.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				String name = JOptionPane.showInputDialog("Please enter a name for the menu.");
				Menu temp = menuManager.maxCaloriesMenu(name);
				menuArrayList.add(temp);
				listModel.addElement(temp);
			}
		});

		//get details of menu
		btnDetails.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				//error checking to make sure that a menu is selected
				if(listMenus.getSelectedIndex() >= 0)
				{
					buildSecWindow();
				}
			}
		});

		//delete list
		btnDelete.addActionListener(new ActionListener ()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				listModel.clear();
				menuArrayList.clear();
			}
		});

		//save menus to file
		btnSaveToFile.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				FileManager.writeMenu("data\\test.txt", menuArrayList);
			}
		});

		//making window visible
		mainMenuWindow.setVisible(true);
	}

	/**
	 * method buildSecWindow
	 */
	private void buildSecWindow()
	{
		//adding frame
		secMenuWindow = new JFrame("Menu: " + menuArrayList.get(listMenus.getSelectedIndex()).getName());
		secMenuWindow.setBounds(20, 20, 1200, 1000);
		mainMenuWindow.setLayout(null);

		//adding labels
		lblEntree2 = new JLabel("Entree");
		lblEntree2.setBounds(70, 50, 200, 50);
		lblEntree2.setFont(new Font("Serif", Font.PLAIN, 20));
		secMenuWindow.getContentPane().add(lblEntree2);

		lblSide2 = new JLabel("Side");
		lblSide2.setBounds(70, 200, 200, 50);
		lblSide2.setFont(new Font("Serif", Font.PLAIN, 20));
		secMenuWindow.getContentPane().add(lblSide2);

		lblSalad2 = new JLabel("Salad");
		lblSalad2.setBounds(70, 350, 200, 50);
		lblSalad2.setFont(new Font("Serif", Font.PLAIN, 20));
		secMenuWindow.getContentPane().add(lblSalad2);

		lblDessert2 = new JLabel("Dessert");
		lblDessert2.setBounds(70, 500, 200, 50);
		lblDessert2.setFont(new Font("Serif", Font.PLAIN, 20));
		secMenuWindow.getContentPane().add(lblDessert2);

		lblTotalCal = new JLabel("Total calories:");
		lblTotalCal.setBounds(70, 650, 200, 50);
		lblTotalCal.setFont(new Font("Serif", Font.PLAIN, 20));
		secMenuWindow.getContentPane().add(lblTotalCal);

		lblTotalPrice = new JLabel("Total price: $");
		lblTotalPrice.setBounds(70, 750, 200, 50);
		lblTotalPrice.setFont(new Font("Serif", Font.PLAIN, 20));
		secMenuWindow.getContentPane().add(lblTotalPrice);

		//adding textAreas
		txtEntree = new JTextArea(menuArrayList.get(listMenus.getSelectedIndex()).getEntree().getName() + "\n"+menuArrayList.get(listMenus.getSelectedIndex()).getEntree().getDescription() + " Calories: " + menuArrayList.get(listMenus.getSelectedIndex()).getEntree().getCalories() + ". Price $" + menuArrayList.get(listMenus.getSelectedIndex()).getEntree().getPrice());
		txtEntree.setBounds(250, 70, 850, 100);
		txtEntree.setFont(new Font("Serif", Font.PLAIN, 20));
		secMenuWindow.getContentPane().add(txtEntree);
		txtEntree.setEditable(false);

		txtSide = new JTextArea(menuArrayList.get(listMenus.getSelectedIndex()).getSide().getName() + "\n"+menuArrayList.get(listMenus.getSelectedIndex()).getSide().getDescription() + " Calories: " + menuArrayList.get(listMenus.getSelectedIndex()).getSide().getCalories() + ". Price $" + menuArrayList.get(listMenus.getSelectedIndex()).getSide().getPrice());
		txtSide.setBounds(250, 220, 850, 100);
		txtSide.setFont(new Font("Serif", Font.PLAIN, 20));
		secMenuWindow.getContentPane().add(txtSide);
		txtSide.setEditable(false);

		txtSalad = new JTextArea(menuArrayList.get(listMenus.getSelectedIndex()).getSalad().getName() + "\n"+menuArrayList.get(listMenus.getSelectedIndex()).getSalad().getDescription() + " Calories: " + menuArrayList.get(listMenus.getSelectedIndex()).getSalad().getCalories() + ". Price $" + menuArrayList.get(listMenus.getSelectedIndex()).getSalad().getPrice());
		txtSalad.setBounds(250, 370, 850, 100);
		txtSalad.setFont(new Font("Serif", Font.PLAIN, 20));
		secMenuWindow.getContentPane().add(txtSalad);
		txtSalad.setEditable(false);

		txtDessert = new JTextArea(menuArrayList.get(listMenus.getSelectedIndex()).getDessert().getName() + "\n"+menuArrayList.get(listMenus.getSelectedIndex()).getDessert().getDescription() + " Calories: " + menuArrayList.get(listMenus.getSelectedIndex()).getDessert().getCalories() + ". Price $" + menuArrayList.get(listMenus.getSelectedIndex()).getDessert().getPrice());
		txtDessert.setBounds(250, 520, 850, 100);
		txtDessert.setFont(new Font("Serif", Font.PLAIN, 20));
		secMenuWindow.getContentPane().add(txtDessert);
		txtDessert.setEditable(false);

		txtCal = new JTextArea(Integer.toString(menuArrayList.get(listMenus.getSelectedIndex()).totalCalories()));
		txtCal.setBounds(250, 670, 200, 50);
		txtCal.setFont(new Font("Serif", Font.PLAIN, 20));
		secMenuWindow.getContentPane().add(txtCal);
		txtCal.setEditable(false);

		double totalPrice = menuArrayList.get(listMenus.getSelectedIndex()).getEntree().getPrice() + menuArrayList.get(listMenus.getSelectedIndex()).getSide().getPrice() + menuArrayList.get(listMenus.getSelectedIndex()).getSalad().getPrice() + menuArrayList.get(listMenus.getSelectedIndex()).getDessert().getPrice();
		txtPrice = new JTextArea(Double.toString(totalPrice));
		txtPrice.setBounds(250, 770, 200, 50);
		txtPrice.setFont(new Font("Serif", Font.PLAIN, 20));
		secMenuWindow.getContentPane().add(txtPrice);
		txtPrice.setEditable(false);

		//fixes JTextArea boxes
		test = new JTextField(" ");
		test.setBounds(0, 0, 1, 1);
		secMenuWindow.getContentPane().add(test);
		test.setEditable(false);

		//making window visible
		secMenuWindow.setVisible(true);
	}

	/**
	 * main method
	 * @param args : taken in as part of the main method
	 */
	public static void main(String[] args) 
	{
		//creates a MenuManger object & makes mainWindow visible
		MenuManagerGUI mmg = new MenuManagerGUI();
	}

}
