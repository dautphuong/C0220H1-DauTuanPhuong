$(document).ready(function () {

    let dataMusic = {
        listMusic: [
            {
                "id": "0",
                "name": 'E.T',
                "artist": 'Katty Perry',
                "url": 'musics/ET-KattyPerry.mp3',
                "cover": 'images/et_katty-perry.png'
            },
            {
                "id": "1",
                "name": 'It will rain',
                "artist": 'Bruno Mars',
                "url": 'musics/It-will-rain.mp3',
                "cover": 'images/it-will-rain.jpg'
            },
            {
                "id": "2",
                "name": 'Red balloon OST',
                "artist": 'Liang Che',
                "url": 'musics/red-balloon.mp3',
                "cover": 'images/red-balloon.jpg'
            },
            {
                "id": "3",
                "name": 'Yasuo',
                "artist": 'MMZ Boy',
                "url": 'musics/yasuo.mp3',
                "cover": 'images/yasuo.jpg'
            },
        ],
    };

    let dataSinger = {
        listSinger: [
            {
                "singerName": "Jhin",
                "avatar": "images/jhin.jpg",
            },
            {
                "singerName": "Vayne",
                "avatar": "images/vayne.jpg",
            },
            {
                "singerName": "Xayah",
                "avatar": "images/xayah.jpg",
            },
            {
                "singerName": "Jinx",
                "avatar": "images/jinx.jpg",
            },
            {
                "singerName": "Leesin",
                "avatar": "images/leesin.jpg",
            },
            {
                "singerName": "Teemo",
                "avatar": "images/teemo.jpg",
            },
        ]
    }

    // PROCESSING TEMPLATE HANDLEBARS

    let loopSingerTemplate = $('#loop-singer-template').html();
    let loopSingerTemplateCompile = Handlebars.compile(loopSingerTemplate)
    let loopSingerTemplateWithData= loopSingerTemplateCompile(dataSinger);
    $('#list-singer').html(loopSingerTemplateWithData);

    let loopMusicTemplate = $('#loop-music-template').html();
    let loopMusicTemplateCompile = Handlebars.compile(loopMusicTemplate);
    let loopMusicTemplateWithData =loopMusicTemplateCompile(dataMusic);
    $('#list-music').html(loopMusicTemplateWithData);
    $(".album-poster").on('click', function (e) {
        var dataSwitchId = $(this).attr('data-switch');
        ap.list.switch(dataSwitchId);
        ap.play();
        $("#aplayer").addClass('showPlayer');
    });

    let arrayResult = [];

    dataMusic.listMusic.forEach((item, i) => {
        arrayResult[i] = item;
    });

    const ap = new APlayer({
        container: document.getElementById('aplayer'),
        listFolded: true,
        mini: false,
        theme: 'black',
        audio: arrayResult
    });
});





