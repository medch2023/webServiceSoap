package org.example;

import proxy.BanqueService;
import proxy.BanqueWs;
import proxy.Compte;

public class ClientWs {
    public static void main(String[] args) {
        BanqueService proxy = new BanqueWs().getBanqueServicePort();
        System.out.println(proxy.conversionEutoMad(800));
        Compte cp = proxy.getConpte(2);
        System.out.println("Code :"+cp.getCode());
        System.out.println("Solde :"+cp.getSolde());
        System.out.println("Date de creation :"+cp.getDateCreation());
    }
}
