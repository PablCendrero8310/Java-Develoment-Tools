package gui.swing.interfaces;

import javax.swing.*;
/**
 * 
 * @param <T> Type of JToggleButton of the Box
 * @param <R> The return type of the method <code>getSelection</code>
 */
public interface JToggleButtonBoxPane<T extends JToggleButton, R> {
	R getSelection();

	T add(String text);

	T add(String text, Icon icon);
	
	T[] getOptions();
}
