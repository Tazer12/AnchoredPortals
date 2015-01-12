package org.anchoredportals.main;

/**
 *
 * @author Iain E. Davis <iain@ruhlendavis.org>
 */
public class InvalidPortalLocationException extends RuntimeException
{
	private static final long serialVersionUID = 336565015338651782L;

	public InvalidPortalLocationException()
	{
		super("Invalid Portal Location");
	}
	
	public InvalidPortalLocationException(String message)
	{
		super(message);
	}
}
