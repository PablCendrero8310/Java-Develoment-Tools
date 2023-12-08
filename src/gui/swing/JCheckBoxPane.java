package gui.swing;

import java.util.ArrayList;

import javax.swing.*;

import gui.swing.exceptions.IncorrectArrayBoundsException;
import gui.swing.interfaces.JToggleButtonBoxPane;

public class JCheckBoxPane extends JBoxPane<JCheckBox> implements JToggleButtonBoxPane<JCheckBox,String[]> {
	private static final long serialVersionUID = 1L;
	private ArrayList<String> selected = new ArrayList<String>();
	private ArrayList<JCheckBox> JCheckBoxes = new ArrayList<JCheckBox>();

	/**
	 * Create a <code>JCheckBoxPane</code> with an unspecified number of
	 * <code>JCheckBoxs</code>.
	 * 
	 * @author PablCendrero8310
	 * @param title   The title of the <code>JCheckBoxPane</code>
	 * @param options The text of the <code>JCheckBox</code> and their
	 *                <code>ActionCommand</code>
	 * 
	 */
	public JCheckBoxPane(String title, String[] options) {

		super(title);

		for (String string : options) {

			JCheckBoxes.add(new JCheckBox(string));

		}
		for (JCheckBox checkbox : JCheckBoxes) {
			add(checkbox);
		}
	}

	/**
	 * Create a
	 * 
	 * @author PablCendrero8310
	 * @param title
	 * @param options
	 * @param icons   The icons of the <code>JCheckBox
	 * @throws NullPointerException
	 * @throws IncorrectArrayBoundsException
	 * 
	 * 
	 */
	public JCheckBoxPane(String title, String[] options, Icon[] icons)
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
			JCheckBox button = new JCheckBox(options[i], icons[i]);

			add(button);

		}
	}

	@Override
	public String[] getSelection() {
		if (this.equals(null))
			return null;
		selected.clear();
		for (JCheckBox checkbox : JCheckBoxes) {
			if (checkbox.isSelected())
				selected.add(checkbox.getText());
		}
		String[] selected_array = new String[selected.size()];
		for (int i = 0; i < selected_array.length; i++) {
			selected_array[i] = selected.get(i);
		}
		return selected_array;
	}

	@Override
	public JCheckBox add(String text) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JCheckBox add(String text, Icon icon) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JCheckBox[] getComponents() {
		// TODO Auto-generated method stub
		return null;
	}

}
