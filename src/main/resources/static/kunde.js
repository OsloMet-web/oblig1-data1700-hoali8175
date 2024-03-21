$(document).ready(function() {
    // Hent alle billetter når siden lastes
    hentAlleBilletter();

    // Lytt etter innlevering av skjemaet for kinobillettbestilling
    $('#billettForm').submit(function(event) {
        event.preventDefault();

        // Validering av inputfelter
        const isValid = validerInput();

        if (!isValid) {
            return;
        }
        const billettData = {
            filmNavn: $('#filmNavn').val(),
            antallBilletter: $('#antallBilletter').val(),
            kundeNavn: $('#kundeNavn').val(),
            kundeEtternavn: $('#kundeEtternavn').val(),
            kundeNummer: $('#kundeNummer').val(),
            kundeEmail: $('#kundeEmail').val()
        };

        $.post('/api/billetter/registrer', billettData, function() {
            hentAlleBilletter();
            $('#billettForm')[0].reset();
        });
    });

    // Lytt etter klikk på slett-knappen
    $('#slettBilletter').click(function() {
        $.ajax({
            url: '/api/billetter/slettAlle',
            type: 'DELETE',
            success: function() {
                $('#billettListe').empty();
            }
        });
    });

    // Funksjon for å hente alle billetter
    function hentAlleBilletter() {
        $.get('/api/billetter/hentAlle', function(data) {
            $('#billettListe').empty();
            data.forEach(function(billett) {
                const ut = `<li>Filmnavn: ${billett.filmNavn}, Antall: ${billett.antallBilletter}, Kunde: ${billett.kundeNavn} ${billett.kundeEtternavn}, Telefon: ${billett.kundeNummer}, E-post: ${billett.kundeEmail}</li>`;
                $('#billettListe').append(ut);
            });
        });
    }

    // Funksjon for å validere inputfelter
    function validerInput() {
        let isValid = true;

        // Validering av filmnavn
        const filmNavn = $('#filmNavn').val().trim();
        if (filmNavn === '') {
            $('#filmNavnError').text('Vennligst velg en film');
            isValid = false;
        }
        else {
            $('#filmNavnError').text('');
        }

        // Validering av antall billetter
        const antallBilletter = $('#antallBilletter').val();
        if (antallBilletter === '') {
            $('#antallBilletterError').text('Vennligst oppgi antall billetter');
            isValid = false;
        } else if (isNaN(antallBilletter) || antallBilletter < 1 || antallBilletter > 9) {
            $('#antallBilletterError').text('Vennligst oppgi et gyldig antall billetter (mellom 1 og 9)');
            isValid = false;
        } else {
            $('#antallBilletterError').text('');
        }

        // Validering av fornavn
        const kundeNavn = $('#kundeNavn').val().trim();
        if (kundeNavn === '') {
            $('#kundeNavnError').text('Vennligst oppgi navnet ditt');
            isValid = false;
        } else {
            $('#kundeNavnError').text('');
        }

        // Validering av etternavn
        const kundeEtternavn = $('#kundeEtternavn').val().trim();
        if (kundeEtternavn === '') {
            $('#kundeEtternavnError').text('Vennligst oppgi etternavnet ditt');
            isValid = false;
        } else {
            $('#kundeEtternavnError').text('');
        }

        // Validering av telefonnummer
        const telefonnummer = $('#kundeNummer').val().trim();
        const telefonRegex = /^\d{8}$/;
        if (telefonnummer === '') {
            $('#kundeNummerError').text('Vennligst oppgi telefonnummer');
            isValid = false;
        } else if (!telefonRegex.test(telefonnummer)) {
            $('#kundeNummerError').text('Vennligst oppgi et gyldig telefonnummer med 8 sifre');
            isValid = false;
        } else {
            $('#kundeNummerError').text('');
        }

        // Validering av e-postadresse
        const kundeEmail = $('#kundeEmail').val().trim();
        const emailRegex = /^\S+@\S+\.\S+$/;
        if (kundeEmail === '') {
            $('#kundeEmailError').text('Vennligst oppgi e-postadresse');
            isValid = false;
        } else if (!emailRegex.test(kundeEmail)) {
            $('#kundeEmailError').text('Vennligst oppgi en gyldig e-postadresse');
            isValid = false;
        } else {
            $('#kundeEmailError').text('');
        }

        return isValid;
    }
});