package com.example.demo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class HelloController {
    @FXML
    private Button simula,rosa,mercato,next,classifica,start,invio;
    @FXML
    private TextArea text= new TextArea();
    @FXML
    private TextField field,scelta;
    @FXML
    private Label label;
    String[] nomiSquadre={"juventus","inter","milan","napoli","atalanta","lazio","roma","torino","bologna","verona",
            "lecce","sampdoria","monza","cremonese","fiorentina","spezia","udinese","empoli","sassuolo","salernitana"};

    ArrayList<Squadra> squadreA= new ArrayList<>();
    Campionato c= new Campionato("SERIE A",squadreA);
    boolean squadraScelta=false;
    String player; //squadra scelta iniziale

    public void simula(ActionEvent actionEvent) {

        if (c.getCampionato().get(0).getPartite() !=38 ) {
            int i = 0;
            int j = 0;
            while (i < c.squadre.size()) {
                j = 0;
                while (j < c.squadre.size()) {
                    if (j != i) {
                        c.match(c.getCampionato().get(i), c.getCampionato().get(j));
                    }
                    j++;
                }
                i++;
            }
            c.sort();
            text.setText("Il campionato si è concluso.\nControlla la classifica.\n"+c.getCampionato().get(19).getNome()+" e' campione d'Italia.\n"+
                    c.getCampionato().get(0).getNome()+" peggior squadra della stagione totalizzando "+c.getCampionato().get(0).getPunti()+" punti.");

        }
        else {
            text.setText("Inizia una nuova stagione. Clicca Next.");
        }
    }



    public void classifica(ActionEvent actionEvent) {
        c.sort();
        text.setText(

                c.getCampionato().get(19).getValore()+"$ "+c.getCampionato().get(19).getPunti()+" "+c.getCampionato().get(19).getVittorie()+" "+c.getCampionato().get(19).getPareggi()+" "+c.getCampionato().get(19).getSconfitte()+" "+c.getCampionato().get(19).getNome()+"\n"+
                        c.getCampionato().get(18).getValore()+"$ "+c.getCampionato().get(18).getPunti()+" "+c.getCampionato().get(18).getVittorie()+" "+c.getCampionato().get(18).getPareggi()+" "+c.getCampionato().get(18).getSconfitte()+" "+c.getCampionato().get(18).getNome()+"\n"+
                        c.getCampionato().get(17).getValore()+"$ "+c.getCampionato().get(17).getPunti()+" "+c.getCampionato().get(17).getVittorie()+" "+c.getCampionato().get(17).getPareggi()+" "+c.getCampionato().get(17).getSconfitte()+" "+c.getCampionato().get(17).getNome()+"\n"+
                        c.getCampionato().get(16).getValore()+"$ "+c.getCampionato().get(16).getPunti()+" "+c.getCampionato().get(16).getVittorie()+" "+c.getCampionato().get(16).getPareggi()+" "+c.getCampionato().get(16).getSconfitte()+" "+c.getCampionato().get(16).getNome()+"\n"+
                        c.getCampionato().get(15).getValore()+"$ "+c.getCampionato().get(15).getPunti()+" "+c.getCampionato().get(15).getVittorie()+" "+c.getCampionato().get(15).getPareggi()+" "+c.getCampionato().get(15).getSconfitte()+" "+c.getCampionato().get(15).getNome()+"\n"+
                        c.getCampionato().get(14).getValore()+"$ "+c.getCampionato().get(14).getPunti()+" "+c.getCampionato().get(14).getVittorie()+" "+c.getCampionato().get(14).getPareggi()+" "+c.getCampionato().get(14).getSconfitte()+" "+c.getCampionato().get(14).getNome()+"\n"+
                        c.getCampionato().get(13).getValore()+"$ "+c.getCampionato().get(13).getPunti()+" "+c.getCampionato().get(13).getVittorie()+" "+c.getCampionato().get(13).getPareggi()+" "+c.getCampionato().get(13).getSconfitte()+" "+c.getCampionato().get(13).getNome()+"\n"+
                        c.getCampionato().get(12).getValore()+"$ "+c.getCampionato().get(12).getPunti()+" "+c.getCampionato().get(12).getVittorie()+" "+c.getCampionato().get(12).getPareggi()+" "+c.getCampionato().get(12).getSconfitte()+" "+c.getCampionato().get(12).getNome()+"\n"+
                        c.getCampionato().get(11).getValore()+"$ "+c.getCampionato().get(11).getPunti()+" "+c.getCampionato().get(11).getVittorie()+" "+c.getCampionato().get(11).getPareggi()+" "+c.getCampionato().get(11).getSconfitte()+" "+c.getCampionato().get(11).getNome()+"\n"+
                        c.getCampionato().get(10).getValore()+"$ "+c.getCampionato().get(1).getPunti()+" "+c.getCampionato().get(10).getVittorie()+" "+c.getCampionato().get(10).getPareggi()+" "+c.getCampionato().get(10).getSconfitte()+" "+c.getCampionato().get(10).getNome()+"\n"+
                        c.getCampionato().get(9).getValore()+"$ "+c.getCampionato().get(9).getPunti()+" "+c.getCampionato().get(9).getVittorie()+" "+c.getCampionato().get(9).getPareggi()+" "+c.getCampionato().get(9).getSconfitte()+" "+c.getCampionato().get(9).getNome()+"\n"+
                        c.getCampionato().get(8).getValore()+"$ "+c.getCampionato().get(8).getPunti()+" "+c.getCampionato().get(8).getVittorie()+" "+c.getCampionato().get(8).getPareggi()+" "+c.getCampionato().get(8).getSconfitte()+" "+c.getCampionato().get(8).getNome()+"\n"+
                        c.getCampionato().get(7).getValore()+"$ "+c.getCampionato().get(7).getPunti()+" "+c.getCampionato().get(7).getVittorie()+" "+c.getCampionato().get(7).getPareggi()+" "+c.getCampionato().get(7).getSconfitte()+" "+c.getCampionato().get(7).getNome()+"\n"+
                        c.getCampionato().get(6).getValore()+"$ "+c.getCampionato().get(6).getPunti()+" "+c.getCampionato().get(6).getVittorie()+" "+c.getCampionato().get(6).getPareggi()+" "+c.getCampionato().get(6).getSconfitte()+" "+c.getCampionato().get(6).getNome()+"\n"+
                        c.getCampionato().get(5).getValore()+"$ "+c.getCampionato().get(5).getPunti()+" "+c.getCampionato().get(5).getVittorie()+" "+c.getCampionato().get(5).getPareggi()+" "+c.getCampionato().get(5).getSconfitte()+" "+c.getCampionato().get(5).getNome()+"\n"+
                        c.getCampionato().get(4).getValore()+"$ "+c.getCampionato().get(4).getPunti()+" "+c.getCampionato().get(4).getVittorie()+" "+c.getCampionato().get(4).getPareggi()+" "+c.getCampionato().get(4).getSconfitte()+" "+c.getCampionato().get(4).getNome()+"\n"+
                        c.getCampionato().get(3).getValore()+"$ "+c.getCampionato().get(3).getPunti()+" "+c.getCampionato().get(3).getVittorie()+" "+c.getCampionato().get(3).getPareggi()+" "+c.getCampionato().get(3).getSconfitte()+" "+c.getCampionato().get(3).getNome()+"\n"+
                        c.getCampionato().get(2).getValore()+"$ "+c.getCampionato().get(2).getPunti()+" "+c.getCampionato().get(2).getVittorie()+" "+c.getCampionato().get(2).getPareggi()+" "+c.getCampionato().get(2).getSconfitte()+" "+c.getCampionato().get(2).getNome()+"\n"+
                        c.getCampionato().get(1).getValore()+"$ "+c.getCampionato().get(1).getPunti()+" "+c.getCampionato().get(1).getVittorie()+" "+c.getCampionato().get(1).getPareggi()+" "+c.getCampionato().get(1).getSconfitte()+" "+c.getCampionato().get(1).getNome()+"\n"+
                        c.getCampionato().get(8).getValore()+"$ "+c.getCampionato().get(0).getPunti()+" "+c.getCampionato().get(0).getVittorie()+" "+c.getCampionato().get(0).getPareggi()+" "+c.getCampionato().get(0).getSconfitte()+" "+c.getCampionato().get(0).getNome()+"\n");

    }



    public void next(ActionEvent actionEvent) {
        if(c.getCampionato().get(0).getPartite()==0){
            text.setText("Il campionato è appena iniziato. \nTermina il campionato "+c.anno+" per iniziare il prossimo.");
        }
        else {
            c.stagioneSuccessiva();
            text.setText("Nuova stagione " + c.anno + " iniziata! Buona fortuna");}

    }

    public void squadre(ActionEvent actionEvent) {
        for(int n=0;n<c.squadre.size();n++) {
            text.setText(c.getSquadre().get(n).toString());
            n++;
            if (n > 19)
                n = 0;
        }
    }


    public void mercato(ActionEvent actionEvent) {
        text.setText("Il mercato e' chiuso. "+player+" dovra' aspettare.");
    }

    public void start(ActionEvent actionEvent) {

        for (int i = 0; i < nomiSquadre.length; i++) {
            squadreA.add(new Squadra(nomiSquadre[i]));
        }
        System.out.println("ok");
        scelta.setVisible(true);
        label.setVisible(true);
}

    public void invio(ActionEvent actionEvent) {
        boolean esito=false;
        String s=field.getText();
        s=s.toLowerCase();
        for(int i=0;i<c.getCampionato().size();i++){
            if (c.getCampionato().get(i).getNome().equals(s)){
                System.out.println(c.getCampionato().get(i).getNome()+" "+s);
                text.setText(c.getCampionato().get(i).toString());
                esito=true;
            }
            if(!esito){
                label.setText("Nessuna squadra trovata con "+s+".\nProva a inserire la Maiuscola o riprova con altri nomi.");
            }
        }
    }

    public void rosa(ActionEvent actionEvent) {
        player=player.toLowerCase();
        for(int i=0;i<c.getCampionato().size();i++){
            if(c.getCampionato().get(i).getNome().equals(player))
            text.setText(c.getCampionato().get(i).toString());
        }
    }

    public void scelta(ActionEvent actionEvent)  {

        boolean esito=false;
        String s=scelta.getText();
        s=s.toLowerCase();
        for(int i=0;i<c.getCampionato().size();i++) {

            if (c.getCampionato().get(i).getNome().equals(s)) {
                label.setText("Buona fortuna " + c.getCampionato().get(i).getNome());
                player = s;
                esito = true;

            }

        }

        label.setVisible(false);
        scelta.setVisible(false);
        classifica.setVisible(true);
        rosa.setVisible(true);
        mercato.setVisible(true);
        next.setVisible(true);
        simula.setVisible(true);
        start.setVisible(false);
        text.setVisible(true);
        field.setVisible(true);
        invio.setVisible(true);
    }
}