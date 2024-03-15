function regKunde() {
    const kunde = {
        navn : $("#navn").val(),
        adresse : $("#adresse").val()
    };
    $.post("/lagre", kunde, function(){
        hentAlle();
    });
    $("#navn").val(""); //tøm input-feltene
    $("#adresse").val("");
}

function hentAlle() {
    $.get( "/hentAlle", function( data ) {
        formaterData(data);
    });
}

function formaterData(kunder){
    let ut = "<table><tr><th>Navn</th><th>Adresse</th></tr>";
    for (const kunde of kunder){
        ut+="<tr><td>"+kunde.navn+"</td><td>"+kunde.adresse+"</td></tr>";
    }
    ut+="</table>";
    $("#kundene").html(ut);
}
function slettKundene() {
    $.get( "/slettAlle", function() {
        hentAlle();
    });
}