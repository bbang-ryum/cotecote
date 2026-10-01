package solution

func productExceptSelf(nums []int) []int {
    temp := []int{}
    m := 1 // [1,2,3,4]
    for i:=0;i<len(nums);i++{
        // 현재를 저장 
        temp = append(temp,m)
        // 현재를 곱한거 저장
        m = m * nums[i]
    }

    r := 1
    for i:=len(nums)-1;i>=0;i--{ // 뒤에서 내려가기
        // 템프에 지금꺼 곱에 이미 지나온 i+1을 곱해서
        temp[i] = temp[i] * r
        // 앞 자리(i-1) 에서는 지금 숫자가 i+1에 있으니 곱하기
        r = r * nums[i]
    }
    return  temp
}
