package restaurantDB;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RestaurantList {
	private static ArrayList<RestaurantInfo> arr;

	public RestaurantList() {
		if (arr == null) {
			Info();
		}

	}

	public List<RestaurantInfo> Info() {
		ArrayList<RestaurantInfo> arr = new ArrayList<RestaurantInfo>();

		arr.add(new RestaurantInfo("�����ٿ�������", "�߽�", "��ȭ�丮", "02-723-7788",
                "���� ���α� ��ö�� 12-24", "������, ��������", "���� ���α� ���ϴ��17�� 15", "http://place.map.kakao.com/2053098478",
                "2053098478", "�����", "https://mblogthumb-phinf.pstatic.net/MjAxOTAxMjdfMjg2/MDAxNTQ4NTc3NTE3ODA3.jyQh1Fb1ZaDOve3moocv4hNA1KRZZ5xqVtm6VKc72bAg.dv325fcLyIGnIgE_Va8Sn2RKWG2Omr6QgMN4n-4zcr4g.JPEG.tjgmlek86/20190123123624_IMG_2498-01-01.jpeg?type=w800"));

        arr.add(new RestaurantInfo("�������", "�߽�", "��ȭ�丮", "070-4213-5678",
                "���� ���α� ��ö�� 11-11", "������(Ư), ������", "���� ���α� û��õ�� 75-2", "http://place.map.kakao.com/2143988257",
                "2143988257", "������", "https://img.siksinhot.com/place/1605152744017465.PNG?w=307&h=300&c=Y"));

        arr.add(new RestaurantInfo("��������", "�Ͻ�", "�ʹ�,��", "02-730-1477",
                "���� ���α� ��ö�� 19-1", "���� Ư�� �ʹ�, ȸ���ʹ�", "���� ���α� ����12�� 14", "http://place.map.kakao.com/15204021",
                "15204021", "�����", "https://media-cdn.tripadvisor.com/media/photo-s/12/05/3d/a2/caption.jpg"));

        arr.add(new RestaurantInfo("�翬ȭ��", "�ѽ�", "����,���", "02-3210-0808",
                "���� ���α� ��ö�� 13-5", "����, Ư���, ���긮��", "���� ���α� ���ϴ��17�� 18", "http://place.map.kakao.com/1619274444",
                "1619274444", "�����", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRTbDQhKh4uMunnB4EE5kH6Lu1OF4YpRJywpA&usqp=CAU"));

        arr.add(new RestaurantInfo("�ŵ�����", "�ѽ�", "����,���", "02-739-8114",
                "���� ���α� ��ö�� 180", "SGP ����, SGP�����", "���� ���α� ���ϴ��17�� 51", "http://place.map.kakao.com/811272424",
                "811272424", "������", "http://www.seoulwire.com/news/photo/201807/19120_14600_5630.jpg"));

        arr.add(new RestaurantInfo("�Ѹ��Ľ�Ÿ", "���", "��Ż����", "02-2261-5973",
                "���� ���α� ��ö�� 5-5", "ũ�� �Ľ�Ÿ, ȭ������", "���� ���α� ���ϴ�� 392", "http://place.map.kakao.com/829236335",
                "829236335", "����������", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ0w6gPHp_Q-I-qQf0zEulEOUmG5KK6zRmygzgNGx7aR-lHlLi_V1QNQsZtgW2MomVo3vk&usqp=CAU"));

        arr.add(new RestaurantInfo("���ε��θ�", "�Ͻ�", "���θ�", "02-722-2384",
                "���� ���α� ��ö�� 7-15", "������, �ͽ�������", "���� ���α� ���ϴ�� 385", "http://place.map.kakao.com/24725107",
                "24725107","�����", "https://mp-seoul-image-production-s3.mangoplate.com/added_restaurants/459460_1498928329342661.jpg"));

        arr.add(new RestaurantInfo("VIP��ġ", "�Ͻ�", "��ġȸ", "02-720-3888",
                "���� ���α� ��ö�� 11-13", "����Ư�� ��ġ ����", "���� ���α� ���ϴ��15�� 25", "http://place.map.kakao.com/149543887",
                "149543887", "������", "https://ssproxy.ucloudbiz.olleh.com/v1/AUTH_e59809eb-bdc9-44d7-9d8f-2e7f0e47ba91/post_card/67041_1592286979_uZtHVD65.jpg"));

        arr.add(new RestaurantInfo("Ȳ�Ұ���", "�ѽ�", "����,���", "02-722-5747",
                "���� ���α� ��ö�� 11-11", "������ �Ұ�� ���", "���� ���α� û��õ�� 75-1", "http://place.map.kakao.com/8696442",
                "8696442", "�����", "https://img.siksinhot.com/place/1508728090055419.jpg"));

        arr.add(new RestaurantInfo("�����8292", "�ѽ�", "����,���", "0507-1389-8384",
                "���� ���α� ��ö�� 43-13", "�������, �η�ġ��", "���� ���α� ����8�� 17", "http://place.map.kakao.com/735673283",
                "735673283", "����������", "https://mblogthumb-phinf.pstatic.net/MjAyMDA5MjNfMTYg/MDAxNjAwODMzNTI1NzIz.FBvpIkAm8uopIJL-kKCXt3Dg03RSBmurjJ2DEtXZxu8g.7Ugue12BSZdKVLD2X2K_OM7CypMwMHMGtn5A0Cf9Kb8g.JPEG.lin1210/IMG_9661.JPG?type=w800"));

        arr.add(new RestaurantInfo("���޵���", "�ѽ�", "����,���", "02-737-5201",
                "���� ���α� ��ö�� 43-15", "������ ���� ����, �δ��", "���� ���α� ����8�� 15", "http://place.map.kakao.com/650374759",
                "650374759", "����������", "https://cdn.imweb.me/thumbnail/20200513/480e99982a163.png"));

        arr.add(new RestaurantInfo("���빮����ȸ��", "�ѽ�", "�ع�����ȸ", "02-737-5115",
                "���� ���α� ��ö�� 263", "Ȱ��ȸ", "���� ���α� �������� 4-1", "http://place.map.kakao.com/13272050",
                "13272050", "�����", "https://mblogthumb-phinf.pstatic.net/20160601_249/bbi_yu_1464745684610p3cSv_PNG/tyle.io-CRpDviQwP8k8sZEJM-1_%2814%29.png?type=w800"));

        arr.add(new RestaurantInfo("���κҵ���", "�ѽ�", "�������", "02-734-1190",
                "���� ���α� ��ö�� 155", "������, �ҵ���", "���� ���α� û��õ�� 67", "http://place.map.kakao.com/17278908",
                "17278908", "������ ����", "https://www.chadorri.com/wp-content/uploads/2013/08/20130812_127.jpg"));

        arr.add(new RestaurantInfo("�����", "���", "��Ż����", "02-739-8208",
                "���� ���α� ��ö�� 19-11", "�Ľ�Ÿ, ������, ȭ������", "���� ���α� ��������2�� 42", "http://place.map.kakao.com/18283622",
                "18283622", "�����", "https://media-cdn.tripadvisor.com/media/photo-s/1a/a9/94/45/caption.jpg"));

        arr.add(new RestaurantInfo("��Ż�󷹽����", "�ѽ�", "�ε�����", "02-318-0094",
                "���� ���α� ��ö�� 35-2", "ī��, ����, ����", "���� ���α� û��õ�� 99", "http://place.map.kakao.com/11834063",
                "11834063", "������", "https://modo-phinf.pstatic.net/20181201_136/1543648648445496se_JPEG/mosazRWPN5.jpeg?type=a1100"));

        arr.add(new RestaurantInfo("�ҹ����", "�ѽ�", "�����", "02-2265-5744",
                "���� ���α� ��ö�� 5-1", "�췷����, �����, ���κ�", "���� ���α� ����16�� 12", "http://place.map.kakao.com/10374336",
                "10374336", "������ ����", "https://mblogthumb-phinf.pstatic.net/MjAxODA1MjlfMjcy/MDAxNTI3NTUyOTA0MTA2.5-hNYc39kEPiiyJqd_yws_bXucW8eutfvf4sqQwzQa0g.3ZzwYW4hl4ysIGA0hbMQ9cOmCcm5NdGDWfaEdbue0lUg.JPEG.sherinks/20180527_185701.jpg?type=w800"));

        arr.add(new RestaurantInfo("��������", "���", "����", "02-795-3283",
                "���� ���α� ��ö�� 42-4", "�����Ը���, ����δ�", "���� ���α� ����10�� 21", "http://place.map.kakao.com/1397192634",
                "1397192634", "������", "http://www.seoulwire.com/news/photo/201810/31169_25058_17.jpg"));

        arr.add(new RestaurantInfo("�����", "�ѽ�", "�ع��������", "02-722-3149",
                "���� ���α� ��ö�� 7-5", "��� ����, ������Į����", "���� ���α� ���ϴ��17�� 8", "http://place.map.kakao.com/221545425",
                "221545425", "����������", "https://t1.daumcdn.net/cfile/tistory/994E93345BFF35F733"));

        arr.add(new RestaurantInfo("����Ȳ�Ұ�â", "�ѽ�", "��â��â", "02-735-6698",
                "���� ���α� ��ö�� 12-23", "Ȳ�Ұ�â, ��â, ��â", "���� ���α� ���ϴ��17�� 17", "http://place.map.kakao.com/9631798",
                "9631798", "�����", "https://mblogthumb-phinf.pstatic.net/MjAxNzExMTlfMTUg/MDAxNTExMDIwMjk0NDQ1.KM9dSD3E9Y3CT_Kjn1tdeRsDi-pQ4v89YPQYurjOaecg.uQf8IItml3XGLaB6HTJ-TvV5KKb66-ZTVSgWZGKEc6wg.JPEG.h00000n/IMG_5015.JPG?type=w800"));

        arr.add(new RestaurantInfo("������", "�ѽ�", "�±�����", "02-725-1688",
                "���� ���α� ��ö�� 43-7", "�±��� �ұ���, ī����", "���� ���α� ����10�� 20", "http://place.map.kakao.com/208592301",
                "208592301", "������", "https://s3-ap-northeast-1.amazonaws.com/dcreviewsresized/20180219014039886_photo0_087b3dd4c395.jpg"));

        arr.add(new RestaurantInfo("�̵�����", "�ѽ�", "�������", "02-725-9233",
                "���� ���α� ��ö�� 11-13", "�����, �����", "���� ���α� ���ϴ��15�� 25", "http://place.map.kakao.com/1969790364",
                "1969790364", "����������", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcROHOQfJlJmOFXw1OAa8ucN8z1Zso_jbUTaEw&usqp=CAU"));

        arr.add(new RestaurantInfo("��ģ��", "�ѽ�", "ġŲ", "02-722-9992",
                "���� ���α� ��ö�� 44-1", "��ģ��Ӵ�, �����޺�", "���� ���α� ��������2�� 16", "http://place.map.kakao.com/26884480",
                "26884480", "����������", "https://mblogthumb-phinf.pstatic.net/MjAxNzA1MTZfMzIg/MDAxNDk0OTIzNTY5NDMz.NuPqvJEoe-JDJO3B1bvyfE-eCeGsWots9uXkLkeGJc4g.-sQLWWJiCzzFWtCGJCYFnwQeoKRc6ML3rgP5ohQwVR8g.JPEG.22woom/KakaoTalk_20170516_172037615%EC%A2%85%EB%A1%9C%EB%A7%9B%EC%A7%91%EC%A2%85%EB%A1%9C%EB%AF%B8%EC%B9%9C%EB%8B%AD_%EC%A2%85%EA%B0%81%EB%A7%9B%EC%A7%91%EC%A2%85%EA%B0%81%EC%97%AD%EB%A7%9B%EC%A7%91_%EC%A2%85%EB%A1%9C%EC%B9%98%ED%82%A8%EC%A7%91_%EC%A2%85.jpg?type=w800"));

        arr.add(new RestaurantInfo("������������", "�ѽ�", "�ع�����", "02-720-7991",
                "���� ���α� ��ö�� 19-16", "��������, ������", "���� ���α� ���ϴ��17�� 46", "http://place.map.kakao.com/8458646",
                "8458646", "����������", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTGfiQVRuEvdbUPddu28qWm4tCXql57VCcs7w&usqp=CAU"));

        arr.add(new RestaurantInfo("����Ƚ��", "�ѽ�", "�ع�����ȸ", "02-738-8588",
                "���� ���α� ��ö�� 256", "���ȸ, Ȱ��ȸ", "���� ���α� ��������2�� 10", "http://place.map.kakao.com/27491757",
                "27491757","�����", "https://t1.daumcdn.net/cfile/tistory/993DAF415E108D5C0A"));

        arr.add(new RestaurantInfo("����������", "�ѽ�", "�������", "02-732-8188",
                "���� ���α� ��ö�� 14-1", "����, ����", "���� ���α� ���ϴ��19�� 16", "http://place.map.kakao.com/170372666",
                "170372666", "����������", "https://mp-seoul-image-production-s3.mangoplate.com/added_restaurants/707338_1492362614652656.jpg"));

        arr.add(new RestaurantInfo("������", "�ѽ�", "�������", "070-4104-9922",
                "���� ���α� ��ö�� 180", "�ѿ� ���� ���, �Ƚ�", "���� ���α� ���ϴ��17�� 51", "http://place.map.kakao.com/916261841",
                "916261841", "�����", "https://static.hubzum.zumst.com/hubzum/2020/11/12/09/06cfa004abc84093ab683f5ce7b5bd45.jpg"));

        arr.add(new RestaurantInfo("���ξ粿ġ", "�߽�", "�粿ġ", "02-720-8168",
                "���� ���α� ��ö�� 13-7", "����, ��޾簥��", "���� ���α� ���ϴ��17�� 20-2", "http://place.map.kakao.com/15864091",
                "15864091", "����������", "http://cdn.ksilbo.co.kr/news/photo/201904/691501_364918_269.jpg"));

        arr.add(new RestaurantInfo("������", "�ѽ�", "�������", "02-723-3590",
                "���� ���α� ��ö�� 44-5", "�����, ���ɰ���", "���� ���α� ����8�� 20", "http://place.map.kakao.com/3678525",
                "3678525", "�����", "https://emmaru.com/matzip/include/pics/2020/01/21/m_19852O213741_7.jpg"));

        arr.add(new RestaurantInfo("���������", "�Ͻ�", "�Ϻ��Ķ��", "02-733-9279",
                "���� ���α� ��ö�� 13-2", "���������, ���������", "���� ���α� ����14�� 16", "http://place.map.kakao.com/1414375847",
                "1414375847", "����������", "https://t1.daumcdn.net/cfile/tistory/99EF96375CE16DF009"));

        arr.add(new RestaurantInfo("�պ���", "�ѽ�", "�������", "02-720-3066",
                "���� ���α� ��ö�� 12-11", "�Ұ�������, �Ұ������", "���� ���α� ���ϴ��15�� 24", "http://place.map.kakao.com/15232887",
                "15232887", "������", "https://media-cdn.tripadvisor.com/media/photo-s/07/ff/ac/d7/caption.jpg"));

        arr.add(new RestaurantInfo("��޽Ĵ�", "�ѽ�", "�������", "02-723-0999",
                "���� ���α� ��ö�� 43-5", "���� �ɸ��, ���� ����", "���� ���α� ����10�� 14", "http://place.map.kakao.com/2131396403",
                "2131396403", "������", "https://mblogthumb-phinf.pstatic.net/MjAxNzA3MTdfMjA4/MDAxNTAwMjU4Mzk0OTE1.Zodr30xmueDpTJWHB8T6N_BYQdS4A_a8hCtDDvu_K0Qg.22FaJZp-zsGm1b4rj4J0MX9ZKqu9HZCVgcIOSoEmFKwg.JPEG.dieunjjang/image_955702301500258372498.jpg?type=w800"));

        arr.add(new RestaurantInfo("�̽��ع�����", "�ѽ�", "�ع�����ȸ", "02-733-1226",
                "���� ���α� ��ö�� 11-1", "Ȱ����ȸ, ����ȸ, ����ȸ", "���� ���α� ���ϴ��15�� 13", "http://place.map.kakao.com/7977978",
                "7977978", "����������", "https://s3-ap-northeast-1.amazonaws.com/dcreviewsresized/20211019104417_photo1_Nm0ULH5g8GOd.jpg"));

        arr.add(new RestaurantInfo("�̳𽡺Ҵ߰���", "�ѽ�", "ġŲ", "02-722-3852",
                "���� ���α� ��ö�� 6-4", "�߸�챸��, ���������", "���� ���α� ���ϴ��19�� 6", "http://place.map.kakao.com/1750296031",
                "1750296031", "����������", "https://mblogthumb-phinf.pstatic.net/MjAxOTA5MjhfMjIg/MDAxNTY5Njc3NTM5MTcx.WZ4M7VVgCSN_cgnzFLwJKOVpmPLHVn0Z4yaSOFHKWvUg.3Xy8rKF71HPWDM2QP_vRUlGeCVSUq92otg4AIOVy-1Qg.JPEG.7533004/%EC%B4%8C%EB%86%88%EC%88%AF%EB%B6%88%EB%8B%AD%EA%B0%88%EB%B9%84.jpg?type=w800"));

        arr.add(new RestaurantInfo("���������޲ٹ�", "�ѽ�", "�ع�����", "02-732-8806",
                "���� ���α� ��ö�� 175", "�޲ٹ� ����, ���� ��Ʈ", "���� ���α� ���ϴ��17�� 47-1", "http://place.map.kakao.com/26432860",
                "26432860","�����", "https://mblogthumb-phinf.pstatic.net/MjAyMDAzMjRfMjAy/MDAxNTg1MDQ4NTEzNjEy.Ww2o2mUBjJzzvWV5k68NTNx3HXoUpN0e9dJ45nJpHLkg.vu4vF1hMhDENgJ6y8x5nUJeYFPzvCIc8MHUTn5vR5mYg.JPEG.noty9240/1585048513241.JPG?type=w800"));

        arr.add(new RestaurantInfo("����Ȳ�Ұ�â", "�ѽ�", "��â��â", "02-723-5157",
                "���� ���α� ��ö�� 18-8", "�Ұ�â����, �ø�", "���� ���α� ��������2�� 31", "http://place.map.kakao.com/21396905",
                "21396905","�����", "https://d2uja84sd90jmv.cloudfront.net/posts/LJ_IYGvldp6xqfk7mQhaKw/m.jpg"));

        arr.add(new RestaurantInfo("�̰����Ǻ���", "�ѽ�", "�ع�����", "02-737-7880",
                "���� ���α� ��ö�� 11-11", "�곫������, ��������", "���� ���α� û��õ�� 75-1", "http://place.map.kakao.com/27146280",
                "27146280", "����������", "https://t1.daumcdn.net/cfile/tistory/253EDF3F532338B30A"));
        
        //�н�ƮǪ��
        arr.add(new RestaurantInfo("����ũ��", "�н�ƮǪ��", "�ܹ���", "02-2158-7575",
                "����Ư���� ���α� û���� ���� 33", "�Ұ�����", "����Ư���� ���α� û���� ���� 33", "https://place.map.kakao.com/2038128499",
                "2038128499", "������", "https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMTExMjhfNzEg%2FMDAxNjM4MDU5NzkzNTY0.exLLp04Q1XYfWVeWWYV2kZZlu7StQh-uRXDkxsUU0Kog.Dcmbrh_YfqKFxOwpw94NSy-ODnkgU1W41AZLxSRo_b4g.JPEG.hmdw1121103%2F20211126%25A3%25DF193306.jpg&type=sc960_832"));
        
        arr.add(new RestaurantInfo("�÷���ũ", "�н�ƮǪ��", "�ܹ���", "02-734-1050",
                "����Ư���� ���α� ��ö�� 155", "�̱���������", "����Ư���� ���α� ��ö�� 155", "https://place.map.kakao.com/1119745454",
                "1119745454", "����������", "https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMTA2MTlfMjI5%2FMDAxNjI0MTAyNTM4NjQ4.3y6--orCIdUjpqaArZW7JWhMMaRnZCjyA-bpFky46HMg.40ugUTSlpHFHv5gefUURBi-sSwYWAccmHkdQncrMR4Ug.JPEG.zooyenzzang%2F20210601_121131.jpg&type=sc960_832"));

        arr.add(new RestaurantInfo("��Ű������", "�н�ƮǪ��", "�ܹ���", "0507-1441-0815",
                "����Ư���� ���α� ���ϴ�� 30�� 30", "�������", "����Ư���� ���α� ���ϴ�� 30�� 30", "https://place.map.kakao.com/1044877256",
                "1044877256", "�����", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMTA1MjRfODgg%2FMDAxNjIxODYyODA5Mzcx.z-FwpuMTVx_DMbknMm--W8KXWjncug5ym0Ks9c6Uat4g.gBfi9Hv1TzoijBHhkMj5Vo1tXriDk2SkbV8U88ef_GUg.JPEG.company4132%2FIMG_1076.JPG"));
        
        
        
        //������
        arr.add(new RestaurantInfo("������", "������", "������", "02-6956-7996",
                "���� ���α� û��õ�� 61 6��", "ĥ�������� ����", "���� ���α� û��õ�� 61 û��õ���� 6��", "https://place.map.kakao.com/1553660349",
                "1553660349", "������", "https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMTEwMjlfNjAg%2FMDAxNjM1NDk0NjIwMDY0.IEyUlUdJcGjZzjm_TWQcDr7TCw9imT3b5OIRN4AKiIsg.yS2ny5cu2AP3OodfkgS2QyXDtUZM1Gz_15vDssqp_PEg.JPEG.jrue614%2FIMG_8819.jpg&type=sc960_832"));
        
        arr.add(new RestaurantInfo("����θ�������", "������", "������", "02-722-7717",
                "���� ���α� ���ϴ�� 383 2��", "����&����ī�� ������", "���� ���α� ���ϴ�� 383 2�� 6��", "https://place.map.kakao.com/601008620",
                "601008620", "����������", "https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMDA2MDRfMjcg%2FMDAxNTkxMjUxMTM3NTI1.U3cRulip3yCBm4TUyXgcogPTbWAAX6ZwS2uo7p2qfmEg.GRUHx3WAqggipprfTq4Ebjm9_uolOVmNuA1sp7psqVsg.JPEG.ghkwack%2FKakaoTalk_20200528_004359768_16.jpg&type=sc960_832"));
        
        arr.add(new RestaurantInfo("ũ������������", "������", "������", "02-6466-7180",
                "���� �߱� û��õ�� 24 1��", "���� ������", "���� �߱� û��õ�� 24 ���̽������Ƽ 1��", "https://place.map.kakao.com/53212532",
                "53212532", "�����", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=https%3A%2F%2Fmyplace-phinf.pstatic.net%2F20211101_256%2F1635767040697zb41s_JPEG%2Fupload_e09263ccc6e15bc0c88138a599c80549.jpeg"));
        
		return arr;

	}

}
