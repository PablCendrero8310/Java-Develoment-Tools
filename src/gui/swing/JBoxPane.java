package gui.swing;

import java.awt.Component;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

public abstract class JBoxPane<T extends Component> extends JPanel {
	@java.io.Serial
	private static final long serialVersionUID = 7620918813842749542L;

	/**
	 * Create a empty <code>JBoxPane</code> with title and a
	 * <code>EtchedBorder</code>
	 * 
	 * @param t The title of <code>JRadioButtonBoxPane</code>
	 */
	public JBoxPane(String t) {

		setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), t));
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
	}
	public abstract T[] getComponents();
}
