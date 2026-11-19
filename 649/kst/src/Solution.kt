class Solution {
    //R 또는 D로 이루어진 문자열 senate가 주어진다
    //문자는 상대방 문자를 제거할 수 있거나 상대방 문자가 하나도 없다면 승리를 선언할 수 있다
    //RD -> Radiant
    //RDD -> Dire
    fun predictPartyVictory(senate: String): String {
        var radiants = 0
        var dires = 0

        val parties = senate.fold(ArrayDeque<Char>()) { parties, party ->
            if (party == 'R') {
                radiants += 1
            } else {
                dires += 1
            }

            parties.addLast(party)
            parties
        }

        var banedRadiants = 0
        var banedDires = 0

        while (radiants != 0 && dires != 0) {
            val first = parties.removeFirst()

            if (first == 'R') {
                if (banedRadiants > 0) {
                    banedRadiants -= 1
                    radiants -= 1
                    continue
                }

                banedDires += 1
                parties.addLast(first)
            }

            if (first == 'D') {
                if (banedDires > 0) {
                    banedDires -= 1
                    dires -= 1
                    continue
                }

                banedRadiants += 1
                parties.addLast(first)
            }
        }


        if (dires == 0) {
            return "Radiant"
        }

        return "Dire"
    }
}
