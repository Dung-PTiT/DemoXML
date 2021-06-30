/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author Dell
 */
public class Base {

    private Common common;
    private ServerInfo serverInfo;
    private ServerMember serverMember;

    public Base() {
    }

    public Base(Common common, ServerInfo serverInfo, ServerMember serverMember) {
        this.common = common;
        this.serverInfo = serverInfo;
        this.serverMember = serverMember;
    }

    public Common getCommon() {
        return common;
    }

    public void setCommon(Common common) {
        this.common = common;
    }

    public ServerInfo getServerInfo() {
        return serverInfo;
    }

    public void setServerInfo(ServerInfo serverInfo) {
        this.serverInfo = serverInfo;
    }

    public ServerMember getServerMember() {
        return serverMember;
    }

    public void setServerMember(ServerMember serverMember) {
        this.serverMember = serverMember;
    }

    public void getConfigInfo() {
        try {
            File file = new File("C:\\Users\\Dell\\Documents\\NetBeansProjects\\Test\\src\\xml\\serverinfo.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(ServerInfo.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            this.serverInfo = (ServerInfo) jaxbUnmarshaller.unmarshal(file);
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        try {
            File file = new File("C:\\Users\\Dell\\Documents\\NetBeansProjects\\Test\\src\\xml\\servermember.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(ServerMember.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            this.serverMember = (ServerMember) jaxbUnmarshaller.unmarshal(file);
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        try {
            File file = new File("C:\\Users\\Dell\\Documents\\NetBeansProjects\\Test\\src\\xml\\common.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Common.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            this.common = (Common) jaxbUnmarshaller.unmarshal(file);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        
        System.out.println(this.common);
    }
}
