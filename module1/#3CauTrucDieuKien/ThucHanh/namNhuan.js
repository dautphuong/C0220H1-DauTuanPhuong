    let year=parseInt(prompt('Nhap nam :'));

    if(year%4===0){
        if(year%100===0){
            if(year%400===0){
                alert(year + ' la nam nhuan');
            }else{
                alert(year +' khong phai nam nhuan');
            }
        }else{
            alert(year +' la nam nhuan');
        }
    }else{
        alert(year +' khong phai nam nhuan');
    }
