package com.bocobi2.dao;

import com.bocobi2.model.Internaute;

public interface InternauteDAO {
   public Internaute findByName(String login);
}
