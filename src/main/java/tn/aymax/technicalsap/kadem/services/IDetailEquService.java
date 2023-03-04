package tn.aymax.technicalsap.kadem.services;

import tn.aymax.technicalsap.kadem.entities.DetailEquipe;

import java.util.List;

public interface IDetailEquService {
    void AddDetail(DetailEquipe de);
    void UpdateDetail(DetailEquipe de);
    void DeleteDetail(Integer idDetailEquipe);
    DetailEquipe GetById(Integer idDetialEquipe);
    List<DetailEquipe> GetAll();
}
