platoon:
	LV Lego0 route R1
	FV Lego1 front runner Lego0
	FV Lego2 front runner Lego1

route R1:
	forward(10)
	turn Left
	forward(50)
	turn Right

constraints:
	20 <= headway <= 30
