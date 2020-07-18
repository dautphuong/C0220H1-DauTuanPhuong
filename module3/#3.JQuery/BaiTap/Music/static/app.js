const ap = new APlayer({
    container: document.getElementById('aplayer'),
    mini: false,
    autoplay: false,
    theme: '#FADFA3',
    loop: 'all',
    order: 'random',
    preload: 'auto',
    volume: 0.7,
    mutex: true,
    listFolded: false,
    listMaxHeight: 90,
    lrcType: 3,
    audio: [{
        name: 'Cho Anh Say',
        artist: 'PhanDuyAnh',
        url: 'mp3/Cho-Anh-Say-Phan-Duy-Anh-ACV.mp3',
        cover: 'cover.jpg'
    },
        {
            name: 'Em Không Sai Chúng Ta Sai',
            artist: 'ERIK',
            url: 'mp3/Em-Khong-Sai-Chung-Ta-Sai-ERIK.mp3',
            cover: 'cover2.jpg',
        }
    ]
});