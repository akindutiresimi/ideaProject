const { areInLove } = require('./breakfast');

describe("areInLove", () => {
    test("man odd, woman even -> in love", () => {
        const result = areInLove(5, 6);
        expect(result).toBe(true);
    });

    test("man even, woman odd -> in love", () => {
        expect(areInLove(4, 3)).toBe(true);
    });

    test("both odd -> not in love", () => {
        expect(areInLove(3, 5)).toBe(false);
    });

    test("both even -> not in love", () => {
        expect(areInLove(2, 8)).toBe(false);
    });
});