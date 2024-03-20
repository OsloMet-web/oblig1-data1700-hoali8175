document.addEventListener('DOMContentLoaded', function () {
    const billettForm = document.getElementById('billettForm');
    const billettListe = document.getElementById('billettListe');
    const sletteKnapp = document.getElementById('slettBilletter');

    // Array for å lagre alle kinobilletter
    const billetter = [];

    // Lytter etter innlevering av skjemaet for kinobillettbestilling
    billettForm.addEventListener('submit', function (event) {
        event.preventDefault();
        // Forhindrer standard oppførsel ved innlevering av registrering

        // Henter verdier fra input feltene
        const filmNavn = document.getElementById('filmNavn').value.trim();
        const antallBilletter = document.getElementById('antallBilletter').value.trim();
        const kundeNavn = document.getElementById('kundeNavn').value.trim();
        const kundeEtternavn = document.getElementById('kundeEtternavn').value.trim();
        const kundeNummer = document.getElementById('kundeNummer').value.trim();
        const kundeEmail = document.getElementById('kundeEmail').value.trim();

        // Henter referanser til feilmeldings-elementene
        const filmNavnError = document.getElementById('filmNavnError');
        const antallBilletterError = document.getElementById('antallBilletterError');
        const kundeNavnError = document.getElementById('kundeNavnError');
        const kundeEtternavnError = document.getElementById('kundeEtternavnError');
        const kundeNummerError = document.getElementById('kundeNummerError');
        const kundeEmailError = document.getElementById('kundeEmailError');

        // Variabel for å spore valideringsstatus
        let isValid = true;

        // Validering av filmnavn
        if (filmNavn === '') {
            filmNavnError.textContent = 'Vennligst velg en film';
            isValid = false;
        } else {
            filmNavnError.textContent = '';
        }

        // Validering av antall billetter
        if (isNaN(antallBilletter) || antallBilletter < 1 || antallBilletter > 9) {
            antallBilletterError.textContent = 'Vennligst oppgi et gyldig antall billetter';
            isValid = false;
        } else {
            antallBilletterError.textContent = '';
        }

        // Validering av fornavn
        if (kundeNavn === '') {
            kundeNavnError.textContent = 'Vennligst oppgi navnet ditt';
            isValid = false;
        } else {
            kundeNavnError.textContent = '';
        }

        // Validering av etternavn
        if (kundeEtternavn === '') {
            kundeEtternavnError.textContent = 'Vennligst oppgi etternavnet ditt';
            isValid = false;
        } else {
            kundeEtternavnError.textContent = '';
        }

        // Validering av telefonnummer
        const telefonRegex = /^\d{8}$/;
        if (!telefonRegex.test(kundeNummer)) {
            kundeNummerError.textContent = 'Vennligst oppgi et gyldig telefonnummer med 8 sifre';
            isValid = false;
        } else {
            kundeNummerError.textContent = '';
        }


        // Validering av email
        const emailRegex = /^\S+@\S+\.\S+$/;
        if (!emailRegex.test(kundeEmail)) {
            kundeEmailError.textContent = 'Vennligst oppgi en gyldig e-postadresse på formen xxxxx@xxxx.xxx';
            isValid = false;
        } else {
            kundeEmailError.textContent = '';
        }


        // returner de sanne valideringene
        if (!isValid) {
            return;
        }

        const billett = {
            filmNavn: filmNavn,
            antallBilletter: antallBilletter,
            kundeNavn: kundeNavn,
            kundeEtternavn: kundeEtternavn,
            kundeNummer: kundeNummer,
            kundeEmail: kundeEmail
        };

        // legge til, vise og restarte
        billetter.push(billett);
        visBilletter();
        billettForm.reset();
    });

    // arraylengde til 0 når sletteknappen trykkes
    sletteKnapp.addEventListener('click', function () {
        billetter.length = 0;
        visBilletter();
    });

    // utforming av hvordan bilettformen skal se ut
    function visBilletter() {
        billettListe.innerHTML = '';
        billetter.forEach(function (billett) {
            const ut = document.createElement('ut');
            ut.textContent = ` Filmnavn:"${billett.filmNavn}" ${billett.antallBilletter} billett(er)  
            Kundenavn:"${billett.kundeNavn}" Etternavn:"${billett.kundeEtternavn}" Telefonnummer:${billett.kundeNummer}
             email:${billett.kundeEmail} --------- `;
            billettListe.appendChild(ut);
        });
    }
});