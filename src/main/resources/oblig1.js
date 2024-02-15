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
