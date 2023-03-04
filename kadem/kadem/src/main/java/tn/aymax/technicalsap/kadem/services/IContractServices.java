package tn.aymax.technicalsap.kadem.services;

import tn.aymax.technicalsap.kadem.entities.Contart;

import java.util.List;

public interface IContractServices {
    void addContart(Contart c);
    void updateContart(Contart c);
    void deleteContart(Integer Contart);
    Contart getById(Integer idContart);
    List<Contart> getAll();
}
}
