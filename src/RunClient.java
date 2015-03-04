/* RunClient - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URL;
import java.util.Properties;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class RunClient extends Applet {
	
	private static final long serialVersionUID = 6743104044892750207L;
	
	public static Properties params = new Properties();
	public JFrame mainFrame;
	public JPanel mainPane = new JPanel();
	public static String mainurl = "127.0.0.1";//"world84.runescape.com";
	public int lang = 0;
	public String frameName = "[621] Deob by 03data";
	public JPanel totalPanel;

    /**
     *
     * @param strings
     */
	public static void main(String[] strings) {
		for (int address = 0; address < strings.length; address++) {
			if (strings[address].equalsIgnoreCase("servaddr"))
				mainurl = strings[++address];
		}
		RunClient runclient = new RunClient();
		runclient.doFrame();
	}

    /**
     * Initialize.
     */
	public void init() {
		doApplet();
	}

    /**
     * Start the applet.
     */
	private void doApplet() {
		try {
			readVars();
			startClient();
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

    /**
     * Start the frame.
     */
	private void doFrame() {
		try {
			readVars();
			openFrame();
			startClient();
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

    /**
     * Read the param vars.
     */
	private void readVars() {
		try {
			RandomAccessFile randomaccessfile = new RandomAccessFile("params.txt", "r");
			String string;
			while ((string = randomaccessfile.readLine()) != null) {
				int i = string.indexOf("document.write('<param name=");
				if (i != -1) {
					String string1 = string.substring(i + 28, string.lastIndexOf(">');"));
					String string2 = string1.split(" ")[0];
					string2 = string2.replaceAll("\"", "");
					String string3 = string1.split(" ")[1];
					string3 = string3.substring(6, string3.length());
					string3 = string3.replaceAll("\"", "");
					// System.out.println(new
					// StringBuilder().append(string_1_).append(", ").append(string_2_).toString());
					params.put(string2, string3);
				}
			}
			randomaccessfile.close();
		} catch (IOException ioexception) {
			System.out.println("Params file not found, loading defaults.");
		}
	}

    /**
     * Open the frame.
     */
	private void openFrame() {
		mainPane.setLayout(new BorderLayout());
		mainPane.add(this);
		mainPane.setPreferredSize(new Dimension(765, 503));
		totalPanel = new JPanel();
		totalPanel.setPreferredSize(new Dimension(765, 503));
		totalPanel.setLayout(new BorderLayout());
		totalPanel.add(mainPane, "Center");
		mainFrame = new JFrame(frameName);
		mainFrame.setLayout(new BorderLayout());
		mainFrame.getContentPane().add(totalPanel);
		mainFrame.setDefaultCloseOperation(3);
		mainFrame.pack();
		mainFrame.setVisible(true);
	}

    /**
     * Starts the client.
     */
	private void startClient() {
		try {
			client.provideLoaderApplet(this);
			client client = new client();
			client.init();
			client.start();
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

    /**
     * Gets a parameter.
     * @param string The parameter to get.
     * @return The parameter that was specified.
     */
	public String getParameter(String string) {
		return (String) params.get(string);
	}

    /**
     * Gets the document base.
     * @return The document base that was specified.
     */
	public URL getDocumentBase() {
		return getCodeBase();
	}

    /**
     * Gets the code base.
     * @return The code base that was specified.
     */
	public URL getCodeBase() {
		URL url;
		try {
			url = new URL(new StringBuilder().append("http://").append(mainurl).toString());
		} catch (Exception exception) {
			exception.printStackTrace();
			return null;
		}
		return url;
	}
}
