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

	public static void main(String[] strings) {
		for (int i = 0; i < strings.length; i++) {
			if (strings[i].equalsIgnoreCase("servaddr"))
				mainurl = strings[++i];
		}
		RunClient runclient = new RunClient();
		runclient.doFrame();
	}

	public void init() {
		doApplet();
	}

	void doApplet() {
		try {
			readVars();
			startClient();
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	public void doFrame() {
		try {
			readVars();
			openFrame();
			startClient();
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	public void readVars() {
		try {
			RandomAccessFile randomaccessfile = new RandomAccessFile("params.txt", "r");
			String string;
			while ((string = randomaccessfile.readLine()) != null) {
				int i = string.indexOf("document.write('<param name=");
				if (i != -1) {
					String string_0_ = string.substring(i + 28, string.lastIndexOf(">');"));
					String string_1_ = string_0_.split(" ")[0];
					string_1_ = string_1_.replaceAll("\"", "");
					String string_2_ = string_0_.split(" ")[1];
					string_2_ = string_2_.substring(6, string_2_.length());
					string_2_ = string_2_.replaceAll("\"", "");
					// System.out.println(new
					// StringBuilder().append(string_1_).append(", ").append(string_2_).toString());
					params.put(string_1_, string_2_);
				}
			}
			randomaccessfile.close();
		} catch (IOException ioexception) {
			System.out.println("Params file not found, loading defaults.");
		}
	}

	public void openFrame() {
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

	public void startClient() {
		try {
			client.provideLoaderApplet(this);
			client client = new client();
			client.init();
			client.start();
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	public String getParameter(String string) {
		return (String) params.get(string);
	}

	public URL getDocumentBase() {
		return getCodeBase();
	}

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
