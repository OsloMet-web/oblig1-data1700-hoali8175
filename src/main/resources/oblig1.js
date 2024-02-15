document.addEventListener('DOMContentLoaded', function () {
    const billettForm = document.getElementById('billettForm');
    const billettListe = document.getElementById('billettListe');
    const sletteKnapp = document.getElementById('slettBilletter');

    // Array for å lagre alle kinobilletter
    const billetter = [];
