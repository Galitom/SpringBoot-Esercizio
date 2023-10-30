package it.example.eserciccio.bootstrap;

import it.example.eserciccio.domain.Nazione;
import it.example.eserciccio.domain.Rilevamento;
import it.example.eserciccio.repositories.NazioneRepository;
import it.example.eserciccio.repositories.RilevamentoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.File;
import java.time.LocalDateTime;
import java.util.Scanner;

@Component
public class BootstrapData implements CommandLineRunner {

    private final NazioneRepository nazioneRepository;
    private final RilevamentoRepository rilevamentoRepository;

    public BootstrapData(NazioneRepository nazioneRepository, RilevamentoRepository rilevamentoRepository) {
        this.nazioneRepository = nazioneRepository;
        this.rilevamentoRepository = rilevamentoRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Server Start");

        Nazione germany = new Nazione();
        germany.setNome("Germany");
        germany = nazioneRepository.save(germany);

        Nazione spain = new Nazione();
        spain.setNome("Spain");
        spain = nazioneRepository.save(spain);

        Nazione france = new Nazione();
        france.setNome("France");
        france = nazioneRepository.save(france);

        Nazione italy = new Nazione();
        italy.setNome("Italy");
        italy = nazioneRepository.save(italy);

        Nazione netherlands = new Nazione();
        netherlands.setNome("Netherlands");
        netherlands = nazioneRepository.save(netherlands);

        Nazione euro = new Nazione();
        euro.setNome("Euro");
        euro = nazioneRepository.save(euro);

        File CSVFile = new File("pippa.txt");
        Scanner sc = new Scanner(CSVFile);
        sc.useDelimiter(";|\n");


        int x = 0;
        String time = "";

        while (sc.hasNext())
        {
            switch (x){
                case 0:
                    time = sc.next();
                    x++;
                    break;
                case 1:
                    Rilevamento r = new Rilevamento();
                    r.setData(time);
                    r.setDebito(sc.next());
                    r.setNazione(germany);
                    r = rilevamentoRepository.save(r);
                    x++;
                    break;
                case 2:
                    Rilevamento r1 = new Rilevamento();
                    r1.setData(time);
                    r1.setDebito(sc.next());
                    r1.setNazione(spain);
                    r1 = rilevamentoRepository.save(r1);
                    x++;
                    break;
                case 3:
                    Rilevamento r2 = new Rilevamento();
                    r2.setData(time);
                    r2.setDebito(sc.next());
                    r2.setNazione(france);
                    r2 = rilevamentoRepository.save(r2);
                    x++;
                    break;
                case 4:
                    Rilevamento r3 = new Rilevamento();
                    r3.setData(time);
                    r3.setDebito(sc.next());
                    r3.setNazione(italy);
                    r3 = rilevamentoRepository.save(r3);
                    x++;
                    break;
                case 5:
                    Rilevamento r4 = new Rilevamento();
                    r4.setData(time);
                    r4.setDebito(sc.next());
                    r4.setNazione(netherlands);
                    r4 = rilevamentoRepository.save(r4);
                    x++;
                    break;
                case 6:
                    Rilevamento r5 = new Rilevamento();
                    r5.setData(time);
                    r5.setDebito(sc.next());
                    r5.setNazione(euro);
                    r5 = rilevamentoRepository.save(r5);
                    x= 0;
                    break;
            }
        }
        sc.close();
        System.out.println("Server Stop");
    }
}
