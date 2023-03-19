/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;
/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import gnu.io.CommPortIdentifier;
import gnu.io.SerialPort;
import gnu.io.SerialPortEvent;
import gnu.io.SerialPortEventListener;
import java.util.Enumeration;

/**
 *
 * @author MEDWINI
 */
public class ConArduino {
    
   /* public SerialPort serialPort;
    
    private static final String PORT_NAMES[] ={
        "COM3"
    };
    
    public static BufferedReader input;
    public static OutputStream output;
    
    public static final int TIME_OUT = 2000; //Para dejar de intentar
    public static final int DATA_RATE = 9600; //Baudios del Arduino (Colocar los que soporte el computador, representa el número de símbolos por segundo en un medio de transmisión.​
    
    public void initialize() {
        CommPortIdentifier portId = null;
        Enumeration portEnum = CommPortIdentifier.getPortIdentifiers();
        
        //Para conectar el puerto COM3
        while (portEnum.hasMoreElements()) {
            CommPortIdentifier currPortId = (CommPortIdentifier) portEnum.nextElement();
            for (String portName : PORT_NAMES) {
                if (currPortId.getName().equals(portName)) {
                    portId = currPortId;
                    break;
                }
            }
        }
        //En caso de que no se realice la conexión
        if (portId == null) {
            System.out.println("Error al conectar con el puerto.");
            return;
        }
        try{
            //Para abrir el puerto que se utilizará
            serialPort = (SerialPort) portId.open(this.getClass().getName(), TIME_OUT);
            //Parámetros de la conexión
            serialPort.setSerialPortParams(DATA_RATE, SerialPort.DATABITS_8,
                     SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);
            //Para abrir las líneas del puerto
            input = new BufferedReader(new InputStreamReader(serialPort.getInputStream()));
            output = serialPort.getOutputStream();
            char ch = 1;
            output.write(ch);
            // Listeners de los eventos
            serialPort.addEventListener((SerialPortEventListener) this);
            serialPort.notifyOnDataAvailable(true);
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }
    //Cerrar el puerto
    public synchronized void close() {
        if (serialPort != null) {
            serialPort.removeEventListener();
            serialPort.close();
        }
    }

    public synchronized void serialEvent(SerialPortEvent oEvent) {
        if (oEvent.getEventType() == SerialPortEvent.DATA_AVAILABLE) {
            try {
                String inputLine = input.readLine();
                System.out.println(inputLine);
            } catch (Exception e) {
                System.err.println(e.toString());
            }
        }

    }
    public static synchronized void writeData(String data) {
        System.out.println("Envíar: " + data);
        try {
            output.write(data.getBytes());
        } catch (Exception e) {
            System.out.println("No fue posible enviar el dato por el puerto");
        }
    }
*/
}