package gui.swing.interfaces;

import javax.swing.*;
/**
 * 
 * @param <T>
 * @param <R>
 */
public interface JToggleButtonBoxPane<T extends JToggleButton, R> {
	R getSelection();

	T add(String text);

	T add(String text, Icon icon);
	
	T[] getOptions();
}
