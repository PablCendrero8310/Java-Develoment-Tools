package gui.swing;

import javax.swing.*;

import gui.swing.exceptions.IncorrectArrayBoundsException;
import gui.swing.interfaces.JToggleButtonBoxPane;

import java.util.ArrayList;

/**
 * <p>
 * This class is useful to create options box with border and title.
 * </p>
 * <p>
 * The boxes have an <code>EtchedBorder</code> (default) and they are
 * <code>JPanel</code> with a <code>BoxLayout</code> using the
 * <code><b><em>Y_AXIS</em></b></code>.
 * </p>
 * 
 * @author PablCendrero8310
 */

public class JRadioButtonBoxPane extends JBoxPane<JRadioButton> implements JToggleButtonBoxPane<JRadioButton, String> {
	@java.io.Serial
	private static final long serialVersionUID = 1L;
	private ArrayList<JRadioButton> JRadioButtons = new ArrayList<JRadioButton>();

	

	/**
	 * Create a <code>JRadioButtonBoxPane</code> with an unspecified number of
	 * <code>JRadioButtons</code>.
	 * 
	 * @author PablCendrero8310
	 * @param title   The title of the <code>JRadioButtonBoxPane</code>
	 * @param options The text of the <code>JRadioButton</code> and their
	 *                <code>ActionCommand</code>
	 */
	public JRadioButtonBoxPane(String title, String[] options)  {
		
		super(title);
		group = new ButtonGroup();
		for (String i : options) {
			JRadioButton button = new JRadioButton(i);
			button.setActionCommand(i);
			group.add(button);
			add(button);
			JRadioButtons.add(button);
			button.setSelected(i == options[0]);

		}
	}

	/**
	 * Create
	 * 
	 * @author PablCendrero8310
	 * @param title 
	 * @param options
	 * @param icons
	 * @throws NullPointerException
	 * @throws IncorrectArrayBoundsException
	 * 
	 * 
	 */
	public JRadioButtonBoxPane(String title, String[] options, ImageIcon[] icons)
			throws NullPointerException, IncorrectArrayBoundsException {
		super(title);
		if (options.equals(null)) {
			throw new NullPointerException("The o[] parameter cannot be null");
		}
		if (icons.equals(null)) {
			throw new NullPointerException("The icons[] parameter cannot be null");
		}
		if (options.length != icons.length) {
			throw new IncorrectArrayBoundsException("The arrays must to have an equal length");
		}

		for (int i = 0; i < options.length; i++) {
			JRadioButton button = new JRadioButton(options[i], icons[i]);
			button.setActionCommand(options[i]);
			group.add(button);
			add(button);
			button.setSelected(i == 0);
		}
	}

	/**
	 * It returns the text of the selected <code>JRadioButton</code>
	 * 
	 * @return The text of the selected <code>JRadioButton</code>
	 */
	@Override
	public String getSelection() {
		if (this.equals(null))
			return null;
		return group.getSelection().getActionCommand();

	}

	private ButtonGroup group;

	/**
	 * Add a JRadiButton with a label
	 */
	@Override
	public JRadioButton add(String text) {
		JRadioButton button = new JRadioButton(text);
		button.setActionCommand(text);
		group.add(button);
		add(button);
		JRadioButtons.add(button);
		return button;
	}

	@Override
	public JRadioButton add(String text, Icon icon) {

		JRadioButton button = new JRadioButton(text, icon);
		button.setActionCommand(text);
		group.add(button);
		add(button);
		JRadioButtons.add(button);
		return button;
	}



	@Override
	public JRadioButton[] getComponents() {
		JRadioButton[] radiobuttons = new JRadioButton[JRadioButtons.size()];
		return JRadioButtons.toArray(radiobuttons);
	}

}
