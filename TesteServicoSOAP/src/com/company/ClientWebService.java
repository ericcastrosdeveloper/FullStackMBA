package com.company;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class ClientWebService {

    private static final String URL_WEBSERVICE =
            "http://argentumws.caelum.com.br/negociacoes";

    public static String getClientes() throws IOException {


            HttpURLConnection connection = null;

        try {
            URL url = new URL(URL_WEBSERVICE);

            connection = (HttpURLConnection)url.openConnection();

            InputStream content = connection.getInputStream();

            StringBuilder sb = new StringBuilder();

            ByteArrayOutputStream buf = new ByteArrayOutputStream();
            int result = content.read();
            while(result != -1) {
                buf.write((byte) result);
                result = content.read();
            }
            // StandardCharsets.UTF_8.name() > JDK 7
            String xmlString = buf.toString("UTF-8");

            JAXBContext jaxbContext = JAXBContext.newInstance(Negociacoes.class);

            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            Negociacoes negociacoes = new Negociacoes();
            negociacoes = (Negociacoes) unmarshaller.unmarshal(new StringReader(xmlString));

            System.out.println(negociacoes);

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (JAXBException e) {
            e.printStackTrace();
        } finally {
            connection.disconnect();
        }

        return "";
    }
}
