package com.br.mauroandremazzola.bragancatechday2017.presentation.home.fragments.speakers;

import com.br.mauroandremazzola.bragancatechday2017.R;
import com.br.mauroandremazzola.bragancatechday2017.data.entities.Speaker;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by Alex on 18/05/2017.
 */
public class SpeakersPresenter {

    //region FIELDS
    private SpeakersView view;
    //endregion

    //region CONSTRUCT
    public SpeakersPresenter(SpeakersView view) {
        this.view = view;
    }
    //endregion

    //region METHODS
    //region PUBLIC METHODS
    public void getSpeakers() {
        List<Speaker> speakers = new ArrayList<>();


        speakers.add(getSpeaker(1, "Ândriu Felipe Coelho", "https://www.linkedin.com/in/%C3%A2ndriu-felipe-coelho-2344b061/", R.drawable.andriu, "Possui experiência em desenvolvimento de software com foco em aplicativos para plataforma iOS. Participa de comunidades como slack.", "Desenvovimento iOS", "11:30"));
        speakers.add(getSpeaker(2, "Djonatas Tenfen", "https://www.linkedin.com/in/djonatas/", R.drawable.djonatas, "Ampla experiência em desenvolvimento de software com ênfase em integrações web-service REST.", "Internet of things", "14:20"));
        speakers.add(getSpeaker(3, "Fernanda Saraiva", "https://www.linkedin.com/in/fesaraiva/", R.drawable.fernanda, "Community Program Manager at Microsoft.", "Microsoft e comunidade", "09:00"));
        speakers.add(getSpeaker(4, "Henrique Rusca", "https://www.linkedin.com/in/henrique-rusca-queiroz-de-moraes-20369a58/", R.drawable.henrique, "Estudou Engenharia Elétrica e Ciência da Computação em Duke University. Grande conhecimento em iOS e Diretor Executivo de Tecnologia na empresa its4company em Miami", "O que a faculdade não te ensina", "15:10"));
        speakers.add(getSpeaker(5, "Marcelo Antonio Maria Junior", "https://www.linkedin.com/in/marcelo-antonio-maria-junior/", R.drawable.marcelo, "Atua como desenvolvedor iOS, possui conhecimento em desenvolvimento de jogos em javascript.", "Dev games", "14:20"));
        speakers.add(getSpeaker(6, "Mauro André B. Mazzola", "https://www.linkedin.com/in/mauro-andr%C3%A9-barros-mazzola-b02996a4/", R.drawable.mauro, "Atua como desenvolvedor iOS e Android", "Android", "13:30"));
        speakers.add(getSpeaker(7, "Milton Carvalhaes Filho", "https://www.linkedin.com/in/miltoncfilho/", R.drawable.milton, "AMCP (Microsoft Certified professional) e um dos fundadores da ONG MTAC (Multi-Platform Technical Audience Contributor) onde nosso foco é difundir e ensinar tecnologia a todos do Brasil.", "NET core | APS.NET core", "10:40"));
        speakers.add(getSpeaker(8, "Rafael Assis", "https://www.linkedin.com/in/rafaelios/", R.drawable.rafael, "Desenvolvedor mobile com ampla experiência em iOS. Atualmente descobrindo novos horizontes em desenvolvimento híbrido com microsoft Xamarin.", "Nativo ao xamarim", "10:40"));
        speakers.add(getSpeaker(10, "Thiago Zavaschi", "https://www.linkedin.com/in/zavaschi/", R.drawable.thiago, "Premier Field Engineer at Microsoft", "Banco de dados", "11:30"));
        speakers.add(getSpeaker(11, "Vitor A. Vale", "https://www.linkedin.com/in/vitoravale/", R.drawable.vitor, "Bacharel em Sistemas de Informação, desenvolvedor full-stack, com ampla experiência em tecnologias Microsoft e Javascript. Associado MTAC Brasil, com foco na difusão de conhecimento e transformação social através da tecnologia.", "Dev web", "15:10"));

        view.loadSpeakers(speakers);
    }
    //endregion

    //region PRIVATE METHODS
    private Speaker getSpeaker(int id, String name, String urlLinkedin, int resIdImage, String description, String lecture, String hour) {
        Speaker speaker = new Speaker(id, name, urlLinkedin, resIdImage);
        speaker.setDescription(description);
        speaker.setLecture(lecture);
        try {
            Date date = new SimpleDateFormat("HH:mm").parse(hour);
            Calendar hourCalendar = Calendar.getInstance();
            hourCalendar.setTime(date);
            speaker.setHour(hourCalendar);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return speaker;
    }
    //endregion
    //endregion
}
