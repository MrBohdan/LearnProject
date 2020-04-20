package hackerrank;

import java.io.*;
import java.lang.*;
import java.net.*;
import java.util.StringTokenizer;

/**
 *
 * @author Bohdan Skrypnyk
 */
public class TelnetClient {

    public static void main(String args[]) throws Exception {
        Socket soc = new Socket(
                "127.0.0.1", 23);
        String Command;

        DataInputStream din = new DataInputStream(soc.getInputStream());
        DataOutputStream dout = new DataOutputStream(soc.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Welcome to Telnet Client");

        if (din.readUTF().equals("ALLOWED")) {
            do {
                System.out.print(
                        "< Telnet Prompt >");
                Command = br.readLine();
                dout.writeUTF(Command);
                if (!Command.equals(
                        "quit")) {
                    System.out.println(din.readUTF());
                }
            } while (!Command.equals(
                    "quit"));
        }
        soc.close();
    }
}

// Telnet server
class TelnetServer {

    public static void main(String args[]) throws Exception {
        ServerSocket Soc = new ServerSocket(23);
        while (true) {
            Socket CSoc = Soc.accept();
            AcceptTelnetClient ob = new AcceptTelnetClient(CSoc);
        }
    }
}

class AcceptTelnetClient extends Thread {

    Socket ClientSocket;
    DataInputStream din;
    DataOutputStream dout;
    String LoginName;
    String Password;

    AcceptTelnetClient(Socket CSoc) throws Exception {
        ClientSocket = CSoc;
        System.out.println("Client Connected ...");
        DataInputStream din = new DataInputStream(ClientSocket.getInputStream());
        DataOutputStream dout = new DataOutputStream(ClientSocket.getOutputStream());

        System.out.println("Waiting for UserName And Password");

        LoginName = din.readUTF();
        Password = din.readUTF();

        start();
    }

    public void run() {
        try {
            DataInputStream din = new DataInputStream(ClientSocket.getInputStream());
            DataOutputStream dout = new DataOutputStream(ClientSocket.getOutputStream());

            BufferedReader brFin = new BufferedReader(new FileReader("Passwords.txt"));

            String LoginInfo = new String("");
            boolean allow = false;

            while ((LoginInfo = brFin.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(LoginInfo);
                if (LoginName.equals("1") && Password.equals("1")) {
                    dout.writeUTF("ALLOWED");
                    allow = true;
                    break;
                }
            }

            brFin.close();

            if (allow == false) {
                dout.writeUTF("NOT_ALLOWED");
            }

            while (allow) {
                String strCommand;
                strCommand = din.readUTF();
                if (strCommand.equals("quit")) {
                    allow = false;
                } else {
                    Runtime rt = Runtime.getRuntime();

                    Process p = rt.exec("TelnetServer.bat " + strCommand);

                    String stdout = new String("");
                    String st;
                    DataInputStream dstdin = new DataInputStream(p.getInputStream());
                    while ((st = dstdin.readLine()) != null) {
                        stdout = stdout + st + "\n";
                    }
                    dstdin.close();
                    dout.writeUTF(stdout);
                }
            }
            ClientSocket.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
