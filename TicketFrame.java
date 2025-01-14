
package za.ac.tut.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class TicketFrame extends JFrame{
    
    private JPanel headingPnl;
    private JPanel namePnl;
    private JPanel surnamePnl;
    private JPanel cellphonePnl;
    private JPanel customerDetailsPnl;
    private JPanel homeTeamPnl;
    private JPanel awayTeamPnl;
    private JPanel numTicketPnl;
    private JPanel totAmtDuePnl;
    private JPanel ticketsPnl;
    private JPanel btnsPnl;
    private JPanel ticketsBtnCombinedPnl;
    private JPanel mainPnl;
    private JPanel ticketCostPnl;
    
    private JLabel headingLbl;
    private JLabel nameLbl;
    private JLabel surnameLbl;
    private JLabel cellphoneLbl;
    private JLabel homeTeamLbl;
    private JLabel awayTeamLbl;
    private JLabel ticketCostLbl;
    private JLabel numTicketsLbl;
    private JLabel totAmtDueLbl;
    
    private JTextField nameTxtFld;
    private JTextField surnameTxtFld;
    private JTextField cellphoneTxtFld;
    private JTextField homeTeamTxtFld;
    private JTextField awayTeamTxtFld;
    private JTextField ticketCostTxtFld;
    private JTextField totAmtDueTxtFld;
    
    private JSlider numTicketsSld;
    
    private JButton buyBtn;
    private JButton clearBtn;
    private JButton exitBtn;

    public TicketFrame() {
        
        setTitle("Ticket Sales");
        setSize(600, 650);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setDefaultLookAndFeelDecorated(true);
        
        headingPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        namePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        surnamePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        cellphonePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        customerDetailsPnl = new JPanel(new GridLayout(3, 1,1,1));
        customerDetailsPnl.setBorder(new TitledBorder(new LineBorder(Color.BLUE, 2), "Customer details"));
        
        homeTeamPnl= new JPanel(new FlowLayout(FlowLayout.LEFT));
        awayTeamPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        ticketCostPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        numTicketPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        totAmtDuePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        ticketsPnl = new JPanel(new GridLayout(5, 1, 1, 1));
        ticketsPnl.setBorder(new TitledBorder(new LineBorder(Color.blue, 2), "Ticket details"));
        
        btnsPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        ticketsBtnCombinedPnl = new JPanel(new BorderLayout());
        mainPnl = new JPanel(new BorderLayout());
        
        headingLbl = new JLabel("Soccer Match Tickets");
        headingLbl.setFont(new Font(Font.SERIF, Font.BOLD + Font.ITALIC, 40));
        headingLbl.setForeground(Color.CYAN);
        
        nameLbl = new JLabel("Name:     ");
        surnameLbl = new JLabel("Surname: ");
        cellphoneLbl = new JLabel("Cellphone: ");
        homeTeamLbl = new JLabel("Home team: ");
        awayTeamLbl = new JLabel("Away team: ");
        ticketCostLbl = new JLabel("Cost price: R");
        numTicketsLbl = new JLabel("Number of ticktes required: ");
        totAmtDueLbl = new JLabel("Toatl amount due: R");
        
        nameTxtFld = new JTextField(10);
        nameTxtFld.setFocusable(true);
        
        surnameTxtFld = new JTextField(10);
        cellphoneTxtFld = new JTextField(10);
        homeTeamTxtFld = new JTextField(10);
        awayTeamTxtFld = new JTextField(10);
        ticketCostTxtFld = new JTextField(10);
        
        totAmtDueTxtFld = new JTextField(20);
        totAmtDueTxtFld.setText("To be calculated later.");
        totAmtDueTxtFld.setEditable(false);
        
        numTicketsSld = new JSlider(1, 20);
        
        buyBtn = new JButton("Buy");
        clearBtn = new JButton("Clear");
        exitBtn = new JButton("Exit");
        
        headingPnl.add(headingLbl);
        
        namePnl.add(nameLbl);
        namePnl.add(nameTxtFld);
        
        surnamePnl.add(surnameLbl);
        surnamePnl.add(surnameTxtFld);
        
        cellphonePnl.add(cellphoneLbl);
        cellphonePnl.add(cellphoneTxtFld);
        
        customerDetailsPnl.add(namePnl);
        customerDetailsPnl.add(surnamePnl);
        customerDetailsPnl.add(cellphonePnl);
        
        homeTeamPnl.add(homeTeamLbl);
        homeTeamPnl.add(homeTeamTxtFld);
        
        awayTeamPnl.add(awayTeamLbl);
        awayTeamPnl.add(awayTeamTxtFld);
        
        ticketCostPnl.add(ticketCostLbl);
        ticketCostPnl.add(ticketCostTxtFld);
        
        numTicketPnl.add(numTicketsLbl);
        numTicketPnl.add(numTicketsSld);
        
        totAmtDuePnl.add(totAmtDueLbl);
        totAmtDuePnl.add(totAmtDueTxtFld);
        
        ticketsPnl.add(homeTeamPnl);
        ticketsPnl.add(awayTeamPnl);
        ticketsPnl.add(ticketCostPnl);
        ticketsPnl.add(numTicketPnl);
        ticketsPnl.add(totAmtDuePnl);
        
        btnsPnl.add(buyBtn);
        btnsPnl.add(clearBtn);
        btnsPnl.add(exitBtn);
        
        ticketsBtnCombinedPnl.add(ticketsPnl, BorderLayout.CENTER);
        ticketsBtnCombinedPnl.add(btnsPnl, BorderLayout.SOUTH);
        
        mainPnl.add(headingPnl, BorderLayout.NORTH);
        mainPnl.add(customerDetailsPnl, BorderLayout.CENTER);
        mainPnl.add(ticketsBtnCombinedPnl, BorderLayout.SOUTH);
        
        add(mainPnl);
        
        pack();
        
        setVisible(true);
       
    }
    
    
    
}
