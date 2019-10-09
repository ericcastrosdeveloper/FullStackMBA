package com.company;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "list")
@XmlAccessorType(XmlAccessType.FIELD)
public class Negociacoes {

    @XmlElement(name = "negociacao")
    private List<Negociacao> negociacoesList = null;

    public List<Negociacao> getNegociacoesList() {
        return negociacoesList;
    }

    public void setNegociacoesList(List<Negociacao> negociacoesList) {
        this.negociacoesList = negociacoesList;
    }
}
