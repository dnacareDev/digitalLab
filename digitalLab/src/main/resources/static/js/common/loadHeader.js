document.addEventListener('DOMContentLoaded', () => {
    setTimeout(() => {
        let thisHTMLName = document.URL.substring(document.URL.indexOf('/'), document.URL.length);
        let thisName = thisHTMLName.split('/');
		

        // header - gnb
        const firstList = document.querySelectorAll('.gnb_list');
        const linkList = document.querySelectorAll('.menu_list');
  
        firstList.forEach((item, idx) => {
            let listText = item.firstElementChild;
            let innerListBox = item.getElementsByClassName('inner_list_box')[0];
            if(idx === 0) {
            	
                let firstA = item.firstElementChild.getAttribute('href');
                let homeSp = firstA.split('/');
				
                if(homeSp[1] === thisName[3]) {
                    item.classList.add('active');
                    return false;
                };
            };
            
            item.childNodes.forEach((i) => {
                if(i.nodeName !== "#text" && i.nodeName !== "P") {
                    let _list = i.querySelectorAll('.menu_list');
                    
                    _list.forEach((l) => {
                        let _a = l.firstElementChild;
                        let hrefVal = _a.getAttribute('href');
                        let _name = hrefVal.split('/');
                        
                        if(_name[1] !== undefined) {
                            if(_name[1] === thisName[3]) {
                                l.classList.add('active');
                                let par = l.parentNode;
                                let parClass = par.getAttribute('class');
                                
                                if(parClass === 'inner_list_box') {
                                    par.parentNode.classList.add('on');
                                    
                                    return false;
                                } else if(parClass === 'inner_in_list') {
                                    if(idx === 2) {
                                        i.style.height = '370px';
                                        par.parentNode.parentNode.parentNode.classList.add('on');
                                        par.parentNode.classList.add('on');
                                        return false;
                                    } else {
										
										// ???????????? css
                                        i.style.height = '120px';
                                        par.parentNode.parentNode.parentNode.classList.add('on');
                                        return false;
                                    };
                                };
                                return false;
                            };
                        };
                        return false;
                    });
                    return false;
                };
                return false;
            });
    
    
            listText.addEventListener('click', () => {
                let hasClass = idx !== 0 ? item.classList.contains('on') :'';
                
                if(hasClass === false) {
                    // ?????? ?????? ??????
                    firstList.forEach((item, idx) => {
                        let innerListBox = item.getElementsByClassName('inner_list_box')[0];
    
                        if(innerListBox !== null && innerListBox !== undefined && idx === 2 || idx === 4) {
                            let innerList = innerListBox.lastElementChild;
                            let warp = innerList.parentNode;
    
                            warp.style.height = '0px';
                            innerList.classList.remove('on');
                        };
                        item.classList.remove('on');
                    });
    
                    let dropDown = idx !== 0 ? item.classList.add('on') : '';
                } else {
                    if(idx !== 0) {
                        // ????????? ????????? ??????
                        if(innerListBox !== null && innerListBox !== undefined && idx === 2 || idx === 4) {
                            let innerList = innerListBox.lastElementChild;
                            let warp = innerList.parentNode;
                            warp.style.height = '0px';
                            innerList.classList.remove('on');
                        };
    
                        item.classList.remove('on');
                    };
                };
            });
    
            //  ????????? list
            if(innerListBox !== null && innerListBox !== undefined && idx < 5) {
                let innerList = innerListBox.lastElementChild;
                let listBox = innerList.firstElementChild;
                
                listBox.addEventListener('click', () => {
                    let has = innerList.classList.contains('on');
    
                    let warp = innerList.parentNode;
                    if(idx === 2) {
                        if(has) {
                            innerList.classList.remove('on');
                            warp.style.height = '270px';
                        } else {
                            warp.style.height = '370px';
                            innerList.classList.add('on');
                        };
                    } else if(idx === 4) {
                        if(has) {
                            innerList.classList.remove('on');
                            warp.style.height = '0px';
                        } else {
							// ???????????? ?????????
                            warp.style.height = '120px';
                            innerList.classList.add('on');
                        };
                    };
                });
            };
        });
        
        // nav ????????? ?????? active 
        linkList.forEach((item) => {
            item.addEventListener('click', () => {
                linkList.forEach((items) => {items.classList.remove('active')});
                item.classList.add('active');
            });
        });
    }, 80);
});