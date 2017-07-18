import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class GridBagDemo extends Applet
{
Button b1,b2;
Label l1,l2;
TextField t1,t2;
public void init()
{
GridBagLayout gbag = new GridBagLayout();
GridBagConstraints gbc = new GridBagConstraints();
setLayout(gbag);
b1=new Button("Submit");
b2=new Button("Cancel");
l1=new Label("ENTER NAME");
l2=new Label("ENTER ADDRESS");
t1=new TextField(20);
t2=new TextField(20);
gbc.anchor = GridBagConstraints.CENTER;
gbc.gridx = 0;
gbc.gridy = 0;
gbc.gridwidth = 1;
gbag.setConstraints(l1, gbc);
add(l1);
gbc.gridx = 1;
gbc.gridy = 0;
gbag.setConstraints(t1, gbc);
add(t1);
gbc.gridx = 0;
gbc.gridy = 1;
gbag.setConstraints(l2, gbc);
add(l2);
gbc.gridx = 1;
gbc.gridy = 1;
gbag.setConstraints(t2, gbc);
add(t2);
gbc.gridx = 0;
gbc.gridy = 2;
gbag.setConstraints(b1, gbc);
add(b1);
gbc.gridx = 1;
gbc.gridy = 2;
gbag.setConstraints(b2, gbc);
add(b2);
setSize(400,400);
}
}

