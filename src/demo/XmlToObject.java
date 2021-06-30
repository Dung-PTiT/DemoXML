package demo;

import java.io.File;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class XmlToObject {

    public static void main(String[] args) {
        int i = 0;
        while (true) {
            try {
                Base base = new Base();
                base.getConfigInfo();
                System.out.println(base.getCommon().getSnapshotDayFileNameFormat() + " " + i++);
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(XmlToObject.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
