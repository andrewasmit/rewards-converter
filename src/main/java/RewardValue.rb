class RewardValueRb
    attr_accessor :miles, :cash
  
    def initialize(cash)
      @cash = cash
      @miles = (cash / 0.0035)
    end
  
    def get_miles_value()
      @miles
    end
  
    def get_cash_value()
      @cash
    end
  end