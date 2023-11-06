package lotto.service;

import camp.nextstep.edu.missionutils.Randoms;
import lotto.domain.Lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LottoService {

    public List<Lotto> makeLottoList(int amount) {
        List<Lotto> lottos = new ArrayList<>();
        for(int i=0; i<amount/1000; i++) {
            Lotto lotto = new Lotto(generateLotto());
            lottos.add(lotto);
        }
        return lottos;
    }
    public List<Integer> generateLotto() {
        List<Integer> lotto = Randoms.pickUniqueNumbersInRange(1,45,6);
        return lotto.stream().sorted().collect(Collectors.toList());
    }
}
