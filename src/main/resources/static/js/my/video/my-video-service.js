const myPageService = (() => {
    const getMyFundingList = async (page, memberId, callback) => {

        page = page || 1;
        const response = await fetch(`/members/video/myFunding/${memberId}/${page}`);
        const myFundingPosts = await response.json();

        console.log("3 : ", response);
        console.log("4 : ", myFundingPosts);

        if(callback){
            callback(myFundingPosts);
        }
    }

    const getFundingBuyerList = async (fundingPostId) => {
        const response = await fetch(`/members/video/myFunding/getBuyerList/${fundingPostId}`);
        const buyersByFundingPostId = await response.json();
    }


    return {getMyFundingList: getMyFundingList, getFundingBuyerList: getFundingBuyerList}
})()