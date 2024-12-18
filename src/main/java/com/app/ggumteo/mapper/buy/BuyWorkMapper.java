package com.app.ggumteo.mapper.buy;

import com.app.ggumteo.domain.buy.BuyWorkDTO;
import com.app.ggumteo.domain.buy.BuyWorkVO;
import com.app.ggumteo.pagination.MySettingTablePagination;
import com.app.ggumteo.pagination.MyWorkAndFundingPagination;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BuyWorkMapper {
    public void insertPurchase(BuyWorkVO buyWorkVO);

    //    작품 구매자 목록 조회
    public List<BuyWorkDTO> selectByWorkPostId(
            @Param("mySettingTablePagination") MySettingTablePagination mySettingTablePagination, @Param("workPostId") Long workPostId);

    //    내 작품 게시물 하나의 구매자 전체 갯수
    public int selectCount(Long workPostId);

    //    발송 여부 체크
    public void updateWorkSendStatus(BuyWorkVO buyWorkVO);

    //   내가 구매한 작품 목록 조회
    public List<BuyWorkDTO> selectBuyWorkListByMember
    (@Param("myWorkAndFundingPagination") MyWorkAndFundingPagination myWorkAndFundingPagination
            , @Param("memberId") Long memberId, @Param("postType") String postType);

    //  내가 구매한 작품 목록 전체 갯수
    public int selectCountBuyWorkListByMember(@Param("memberId") Long memberId, @Param("postType") String postType);

    // 내가 구매한 작품 결제 내역 삭제
    public void deleteBuyWorkPost(Long id);
}
