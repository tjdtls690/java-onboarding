# 기능 구현 목록

## 문제 1
- [x] 각 플레이어의 가장 큰 더하기 숫자 구하기
  - [x] 해당 숫자의 자릿수 합 구하기
  - [x] 가장 큰 더하기 숫자 구하기

- [x] 각 플레이어의 가장 큰 곱하기 숫자 구하기
  - [x] 해당 숫자의 자릿수 곱하기 구하기
  - [x] 가장 큰 곱하기 숫자 구하기

- [x] 각 플레이어의 가장 큰 수 구하기
- [x] 결과 구하기
  - [x] pobi win : 1
  - [x] crong win : 2
  - [x] draw : 0
  - [x] exception : -1

- [x] 예외 처리
  - [x] 왼쪽 홀수, 오른쪽 짝수가 아닌 경우
  - [x] 두 수의 차이가 1이 아닌 경우
  - [x] 왼쪽 수가 오른쪽 수보다 더 큰 경우


## 문제 2
- [x] 두 문자열이 같은지 확인하기
- [x] 문자열의 문자들을 두 문자씩 차례대로 확인하며 같은 두 문자는 삭제하기
- [x] 겹치는 문자가 없다면 결과 리턴하기


## 문제 3
- [x] 숫자의 각 자리수 중 3,6,9인 수의 개수 구하기
- [x] 입력된 숫자까지 증가하면서 3,6,9 개수 더하기
- [x] 결과 반환하기


## 문제 4
- [x] 소문자 변환 전용 배열 초기화하기
- [x] 대문자 변환 전용 배열 초기화하기
- [x] 대문자 변환하기
- [x] 소문자 변환하기
- [x] 문자열 전체 변환하기
  - [x] 알파벳인 경우 대문자, 소문자 판별해서 변환하기
  - [x] 알파벳이 아닌 문자는 그대로 반환하기


## 문제 5
- [x] 화폐 단위 배열 초기화하기

- [x] 각 화폐 개수 구하기
  - [x] 오만원 권 개수 구하기
  - [x] 만원 권 개수 구하기
  - [x] 오천원 권 개수 구하기
  - [x] 천원 권 개수 구하기
  - [x] 오백원 동전 개수 구하기
  - [x] 백원 동전 개수 구하기
  - [x] 오십원 동전 개수 구하기
  - [x] 십원 동전 개수 구하기
  - [x] 일원 동전 개수 구하기

- [x] 각 화폐 개수 구한 후 남은 돈 구하기
  - [x] 오만원 권 개수 구한 후 남은 돈 반환하기
  - [x] 만원 권 개수 구한 후 남은 돈 반환하기
  - [x] 오천원 권 개수 구한 후 남은 돈 반환하기
  - [x] 천원 권 개수 구한 후 남은 돈 반환하기
  - [x] 오백원 동전 개수 구한 후 남은 돈 반환하기
  - [x] 백원 동전 개수 구한 후 남은 돈 반환하기
  - [x] 오십원 동전 개수 구한 후 남은 돈 반환하기
  - [x] 십원 동전 개수 구한 후 남은 돈 반환하기

- [x] 각 화폐 개수 리스트 추가 후 결과 반환하기


## 문제 6
- [x] 전체 크루의 이름 문자열을 차례대로 연속된 두 글자가 이미 존재하는지 확인하기
  - [x] 한 명의 크루의 이름 문자열을 차례대로 연속된 두 글자가 이미 존재하는지 확인하기
  - [x] 연속된 두 글자가 이미 존재하는지 확인하기
- [x] 차례대로 연속된 두 글자를 저장하기
- [x] 이미 해당 순서의 연속된 두 글자가 존재할 시, 이메일 저장(HashSet)
- [x] 저장된 이메일을 오름차순으로 정렬하기
- [x] 정렬된 이메일 반환하기


## 문제 7
- [x] 유저의 친구목록 저장하기
- [x] 각 유저의 친구목록 저장하기
- [x] 입력 값으로 등장한 모든 유저들과 사용자와 함께 아는 친구 수 구하기
- [x] 해당 유저의 사용자와 함께 아는 친구 수의 * 10 점수 추가하기
- [ ] 방문자는 방문 횟수만큼 점수 추가하기
- [ ] 이미 친구인 사람 제외하기
- [ ] 결과 반환하기

최대 5명을 return
추천 점수가 0점인 경우 추천하지 않으며,
추천 점수가 같은 경우는 이름순으로 정렬한다.