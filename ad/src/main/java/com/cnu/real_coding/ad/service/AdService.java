package com.cnu.real_coding.ad.service;

import com.cnu.real_coding.common.entity.Advertisement;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class AdService {
    private final List<Advertisement> ads = List.of(
            new Advertisement("구글 개발자 채용", "구글코리아에서 우수한 인재들을 모집합니다", "https://www.google.com/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png", "https://www.google.com"),
            new Advertisement("나이키 멤버십 빅 세일", "오직 나이키 멤버십을 위한 단 3일! 새학기 설레는 마음을 조던과 함께", "https://cdn.eyesmag.com/content/uploads/sliderImages/2020/12/24/air-jordan-1-ko-chicago-01-406abe1e-0ef2-4b71-b479-7716fdb60630.jpg", "https://www.nike.com/kr"),
            new Advertisement("충남대학교 컴퓨터공학 대학원생 상반기 모집", "충남대학교 컴퓨터공학 대학원생 상반기 모집을 시작합니다. 자세한 사항은 홈페이지를 참고해주세요.", "https://grad.cnu.ac.kr/_res/grad/img/common/logo-grad.png", "https://plus.cnu.ac.kr/html/kr/"),
            new Advertisement("쿠팡 와우회원 1만원 할인", "오직 쿠팡 와우회원에게만 주어지는 마지막 기회! 1만원 할인 쿠폰을 받아보세요.", "https://news.coupang.com/wp-content/uploads/2021/10/%E1%84%8B%E1%85%AA%E1%84%8B%E1%85%AE%E1%84%92%E1%85%A1%E1%86%AF%E1%84%8B%E1%85%B5%E1%86%AB%E1%84%80%E1%85%A1.jpg", "https://www.coupang.com/"),
            new Advertisement("네이버 쇼핑에서 후기쓰고 포인트 적립하자~", "믿고보는 네이버 쇼핑 후기! 후기쓰고 포인트 적립하자~", "https://center.shopping.naver.com/img/img_main_carousel.jpg", "https://www.naver.com/"),
            new Advertisement("시험기간 이벤트 참여하고 간식받자!", "공부하기도 힘든데 배는 고프지 말아야지! 시험기간 이벤트 참여하고 간식받자!", "https://rc.cnu.ac.kr/xe/files/attach/images/2291/823/004/eac3cb09a573dc8f1684d22e47ab0492.jpg", "https://www.naver.com/")
    );

    public Advertisement getAd() {
        int randomIndex = new Random().nextInt(ads.size());
        return ads.get(randomIndex);
    }
}
