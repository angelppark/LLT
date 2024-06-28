function init(){

    AOS.init();

    // 스크롤 이벤트
    window.addEventListener('scroll', () => {
        const fadeText = document.querySelector('.fade_text');
        const scrollTop = window.scrollY; // 현재 스크롤 위치
        const sectionSlide1 = document.querySelector('.section.slide1');
        const sectionHeight = sectionSlide1.getBoundingClientRect().height; //슬라이드1 높이 구하기
        const maxScroll = sectionHeight - window.innerHeight; // 최대 스크롤 가능 거리

        // 현재 스크롤 위치를 최대 스크롤 거리로 나누어 0~1 사이의 값을 얻음
        const opacity = 1 - (scrollTop / maxScroll);

        // 텍스트의 불투명도(opacity)를 설정
        fadeText.style.opacity = opacity;

        const sectionSlide2 = document.querySelector('.section.slide2');
        const targetHeight = 1200;

       /* if(window.scrollY > targetHeight) {
            sectionSlide2.setAttribute('data-aos', 'slide-down');
            sectionSlide2.style.opacity = 1;
            sectionSlide2.style.marginTop = 0;
            AOS.refresh();
        }else {
            sectionSlide2.style.opacity = 0;
            sectionSlide2.style.marginTop = '400px';
            AOS.refresh();
        }*/

    });

}