import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/billetter")
public class BillettController {

    private final ArrayList<Billett> billetter = new ArrayList<>();

    @PostMapping("/registrer")
    public void registrerBillett(@RequestBody Billett billett) {
        billetter.add(billett);
    }

    @GetMapping("/hentAlle")
    public ArrayList<Billett> hentAlleBilletter() {
        return billetter;
    }
}