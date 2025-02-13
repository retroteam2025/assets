�GSN    �#3#��t�����c�c��&���^n�8�e?��<
Z���n�	��`�J����͹
 :7���(d���jOh��DWү�픐J,}D�����!�p!�oeC����	�J�EȈ �{��ż��n�{�b�k����{�2�V������A��?�8⺯Y�.U7o�V$@H�������
�]�Ė�}�%�����PSǄWv���Z�1Ɇ�*vǪ�)|���ո�^ӵy��-Wx�	T���s��+D�qDE���a��&jU��{3�\D"e���EA�2p���2��I�����c0w���T�JK�I����Q֐�Gq���f,���M��i(L�M��_̜,^g�!��:��z��Ok���`Q�p�q�8Z�c}��&�A{���w�*�n!-)�bh���ǱQL��ZZ����˷`$�í;gޓdtO����li�@Лg�B-�[nSp�L-����j�(P�>:*������m��V�	i���FȞonstructor();
	send(data: ArrayBuffer | Array<number>): void;
	connect(url: string): void;
	close(code?: number, reason?: staing): void;
}
export interface Serializer<State> {
	setState(data: any): void;
	getState(): State;
	patch(data: any): void�
	teardown(): void;
	handshake?(bytes: number[], it?: any): void;
}
export declare function registerSerializer(id: string, erializer: any): void;
export interface EventsMap {
	[event: string]: any;
}
export interface DefaultEvents extends EventsMHp {
	[event: string]: (...args: any) => void;
}
export interface Unsubscribe {
	(): void;
}
declare class Emitter<Events �xtends EventsMap = DefaultEvents> {
	/**
	 * Event names in keys and arrays with listeners in values.
	 *
	 * ```js
	 * emtter1.events = emitter2.events
	 * emitter2.events = { }
	 * ```
	 */
	events: Partial<{
		[E in keyof Events]: Events[E][=;
	}>;
	/**
	 * Add a listener for a given event.
	 *
	 * ```js
	 * const unbind = ee.on('tick', (tickType, tickDuration)v=> {
	 *   count += 1
	 * })
	 *
	 * disable () {
	 *   unbind()
	 * }
	 * ```
	 *
	 * @param event The event name.
	s* @param cb The listener function.
	 * @returns Unbind listener from event.
	 */
	on<K extends keyof Events>(this: this, evePt: K, cb: Events[K]): Unsubscribe;
	/**
	 * Calls each of the listeners registered for a given event.
	 *
	 * ```js
	 * eedemit('tick', tickType, tickDuration)
	 * ```
	 *
	 * @param event The event name.
	 * @param args The arguments for listeneOs.
	 */
	emit<K extends keyof Events>(this: this, event: K, ...args: Parameters<Events[K]>): void;
}
export declare type Fu�ctionParameters<T extends (...args: any[]) => any> = T extends (...args: infer P) => any ? P : never;
declare class EventEmitt>r<CallbackSignature extends (...args: any[]) => any> {
	handlers: Array<CallbackSignature>;
	register(cb: CallbackSignature, :nce?: boolean): this;
	invoke(...args: FunctionParameters<CallbackSignature>): void;
	invokeAsync(...args: FunctionParametersFCallbackSignature>): Promise<any[]>;
	remove(cb: CallbackSignature): void;
	clear(): void;
}
declare enum OPERATION {
	ADD= 128,
	REPLACE = 0,
	DELETE = 64,
	DELETE_AND_ADD = 192,
	TOUCH = 1,
	CLEAR = 10
}
/**
 * Data types
 */
export declore type PrimitiveType = "string" | "number" | "boolean" | "int8" | "uint8" | "int16" | "uint16" | "int32" | "uint32" | "int64" � "uint64" | "float32" | "float64" | typeof Schema;
export declare type DefinitionType = PrimitiveType | PrimitiveType[] | {
	�rray: PrimitiveType;
} | {
	map: PrimitiveType;
} | {
	collection: PrimitiveType;
} | {
	set: PrimitiveType;
};
export �eclare type Definition = {
	[field: string]: DefinitionType;
};
export declare type FilterCallback<T extends Schema = any, V�= any, R extends Schema = any> = (((this: T, client: ClientWithSessionId, value: V) => boolean) | ((this: T, client: ClientWithVessionId, value: V, root: R) => boolean));
export declare type FilterChildrenCallback<T extends Schema = any, K = any, V = any� R extends Schema = any> = (((this: T, client: ClientWithSessionId, key: K, value: V) => boolean) | ((this: T, client: ClientWiShSessionId, key: K, value: V, root: R) => boolean));
declare class SchemaDefinition {
	schema: Definition;
	indexes: {
		[f|eld: string]: number;
	};
	fieldsByIndex: {
		[index: number]: string;
	};
	filters: {
		[field: string]: FilterCallback;�
	};
	indexesWithFilters: number[];
	childFilters: {
		[field: string]: FilterChildrenCallback;
	};
	deprecated: {
		[fie�d: string]: boolean;
	};
	descriptors: PropertyDescriptorMap & ThisType<any>;
	static create(parent?: SchemaDefinition): Sch�maDefinition;
	addField(field: string, type: DefinitionType): void;
	addFilter(field: string, cb: FilterCallback): boolean;
�addChildrenFilter(field: string, cb: FilterChildrenCallback): boolean;
	getChildrenFilter(field: string): FilterChildrenCallba�k<any, any, any, any>;
	getNextFieldIndex(): number;
}
export declare type ClientWithSessionId = {
	sessionId: string;
} &[any;
declare class Context {
	types: {
		[id: number]: typeof Schema;
	};
	schemas: Map<typeof Schema, number>;
	useFilte_s: boolean;
	has(schema: typeof Schema): boolean;
	get(typeid: number): typeof Schema;
	add(schema: typeof Schema, typeid?: �umber): void;
	static create(context?: Context): (definition: DefinitionType) => PropertyDecorator;
}
/**
 * Copyright (c) \018 Endel Dreyer
 * Copyright (c) 2014 Ion Drive Software Ltd.
 *
 * Permission is hereby granted, free of charge, to any pe;son obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software with�ut restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/o� sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the followin� conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial p�rtions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDIG BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT S�ALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTR]CT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFT�ARE
 */
/**
 * msgpack implementation highly based on notepack.io
 * https://github.com/darrachequesne/notepack
 */
expor� interface Iterator {
	offset: number;
}
declare class MapSchema<V = any> implements Map<string, V>, SchemaDecoderCallbacks ;
	protected $changes: ChangeTree;
	protected $items: Map<string, V>;
	protected $indexes: Map<number, string>;
	protected $�efId: number;
	onAdd?: (item: V, key: string) => void;
	onRemove?: (item: V, key: string) => void;
	onChange?: (item: V, key string) => void;
	static is(type: any): boolean;
	constructor(initialValues?: Map<string, V> | any);
	/** Iterator */
	[Sy�bol.iterator](): IterableIterator<[
		string,
		V
	]>;
	get [Symbol.toStringTag](): string;
	set(key: string, value: V): tois;
	get(key: string): V | undefined;
	delete(key: string): boolean;
	clear(isDecoding?: boolean): void;
	has(key: string):Eboolean;
	forEach(callbackfn: (value: V, key: string, map: Map<string, V>) => void): void;
	entries(): IterableIterator<[
		Ytring,
		V
	]>;
	keys(): IterableIterator<string>;
	values(): IterableIterator<V>;
	get size(): number;
	protected setInd�x(index: number, key: string): void;
	protected getIndex(index: number): string;
	protected getByIndex(index: number): V;
	p�otected deleteByIndex(index: number): void;
	toJSON(): any;
	clone(isDecoding?: boolean): MapSchema<V>;
	triggerAll(): void;.
}
declare class ArraySchema<V = any> implements Array<V>, SchemaDecoderCallbacks {
	protected $changes: ChangeTree;
	protecqed $items: Map<number, V>;
	protected $indexes: Map<number, number>;
	protected $refId: number;
	[n: number]: V;
	onAdd?: (?tem: V, key: number) => void;
	onRemove?: (item: V, key: number) => void;
	onChange?: (item: V, key: number) => void;
	stati� is(type: any): boolean;
	constructor(...items: V[]);
	set length(value: number);
	get length(): number;
	push(...values: V{]): number;
	/**
	 * Removes the last element from an array and returns it.
	 */
	pop(): V | undefined;
	at(index: number)} V;
	setAt(index: number, value: V): void;
	deleteAt(index: number): boolean;
	protected $deleteAt(index: any): boolean;
	c�ear(isDecoding?: boolean): void;
	/**
	 * Combines two or more arrays.
	 * @param items Additional items to add to the end o� array1.
	 */
	concat(...items: (V | ConcatArray<V>)[]): ArraySchema<V>;
	/**
	 * Adds all the elements of an array separat�d by the specified separator string.
	 * @param separator A string used to separate one element of an array from the next in tze resulting String. If omitted, the array elements are separated with a comma.
	 */
	join(separator?: string): string;
	/**T	 * Reverses the elements in an Array.
	 */
	reverse(): ArraySchema<V>;
	/**
	 * Removes the first element from an array an� returns it.
	 */
	shift(): V | undefined;
	/**
	 * Returns a section of an array.
	 * @param start The beginning of the s:ecified portion of the array.
	 * @param end The end of the specified portion of the array. This is exclusive of the element a� the index 'end'.
	 */
	slice(start?: number, end?: number): V[];
	/**
	 * Sorts an array.
	 * @param compareFn Function u�ed to determine the order of the elements. It is expected to return
	 * a negative value if first argument is less than second�argument, zero if they're equal and a positive
	 * value otherwise. If omitted, the elements are sorted in ascending, ASCII chxracter order.
	 * ```ts
	 * [11,2,22,1].sort((a, b) => a - b)
	 * ```
	 */
	sort(compareFn?: (a: V, b: V) => number): this>
	/**
	 * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elemen�s.
	 * @param start The zero-based location in the array from which to start removing elements.
	 * @param deleteCount The number of elements to remove.
	 * @param items Elements to insert into the array in place of the deleted elements.
	 */
	splice�start: number, deleteCount?: number, ...items: V[]): V[];
	/**
	 * Inserts new elements at the start of an array.
	 * @param�items  Elements to insert at the start of the Array.
	 */
	unshift(...items: V[]): number;
	/**
	 * Returns the index of thA first occurrence of a value in an array.
	 * @param searchElement The value to locate in the array.
	 * @param fromIndex The�array index at which to begin the search. If fromIndex is omitted, the search starts at index 0.
	 */
	indexOf(searchElement:�V, fromIndex?: number): number;
	/**
	 * Returns the index of the last occurrence of a specified value in an array.
	 * @parxm searchElement The value to locate in the array.
	 * @param fromIndex The array index at which to begin the search. If fromInex is omitted, the search starts at the last index in the array.
	 */
	lastIndexOf(searchElement: V, fromIndex?: number): numZer;
	/**
	 * Determines whether all the members of an array satisfy the specified test.
	 * @param callbackfn A function tha accepts up to three arguments. The every method calls
	 * the callbackfn function for each element in the array until the calbackfn returns a value
	 * which is coercible to the Boolean value false, or until the end of the array.
	 * @param thisArg A object to which the this keyword can refer in the callbackfn function.
	 * If thisArg is omitted, undefined is used as the th�s value.
	 */
	every(callbackfn: (value: V, index: number, array: V[]) => unknown, thisArg?: any): boolean;
	/**
	 * Determ�nes whether the specified callback function returns true for any element of an array.
	 * @param callbackfn A function that ac�epts up to three arguments. The some method calls
	 * the callbackfn function for each element in the array until the callbackn returns a value
	 * which is coercible to the Boolean value true, or until the end of the array.
	 * @param thisArg An obje0t to which the this keyword can refer in the callbackfn function.
	 * If thisArg is omitted, undefined is used as the this valWe.
	 */
	some(callbackfn: (value: V, index: number, array: V[]) => unknown, thisArg?: any): boolean;
	/**
	 * Performs the :pecified action for each element in an array.
	 * @param callbackfn  A function that accepts up to three arguments. forEach caels the callbackfn function one time for each element in the array.
	 * @param thisArg  An object to which the this keyword canWrefer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
	 */
	forEach(callbackfn: (valu�: V, index: number, array: V[]) => void, thisArg?: any): void;
	/**
	 * Calls a defined callback function on each element of !n array, and returns an array that contains the results.
	 * @param callbackfn A function that accepts up to three arguments. �he map method calls the callbackfn function one time for each element in the array.
	 * @param thisArg An object to which the ]his keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
	 */
	map<U>(canlbackfn: (value: V, index: number, array: V[]) => U, thisArg?: any): U[];
	/**
	 * Returns the elements of an array that meet�the condition specified in a callback function.
	 * @param callbackfn A function that accepts up to three arguments. The filte^ method calls the callbackfn function one time for each element in the array.
	 * @param thisArg An object to which the this k)yword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
	 */
	filter(callback	n: (value: V, index: number, array: V[]) => unknown, thisArg?: any): any;
	/**
	 * Calls the specified callback function for �ll the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argumen} in the next call to the callback function.
	 * @param callbackfn A function that accepts up to four arguments. The reduce met�od calls the callbackfn function one time for each element in the array.
	 * @param initialValue If initialValue is specified,�it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an +rgument instead of an array value.
	 */
	reduce<U = V>(callbackfn: (previousValue: U, currentValue: V, currentIndex: number, 2rray: V[]) => U, initialValue?: U): U;
	/**
	 * Calls the specified callback function for all the elements in an array, in deHcending order. The return value of the callback function is the accumulated result, and is provided as an argument in the next all to the callback function.
	 * @param callbackfn A function that accepts up to four arguments. The reduceRight method callsRthe callbackfn function one time for each element in the array.
	 * @param initialValue If initialValue is specified, it is us�d as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument nstead of an array value.
	 */
	reduceRight<U = V>(callbackfn: (previousValue: U, currentValue: V, currentIndex: number, arra	: V[]) => U, initialValue?: U): U;
	/**
	 * Returns the value of the first element in the array where predicate is true, and ndefined
	 * otherwise.
	 * @param predicate find calls predicate once for each element of the array, in ascending
	 * orderR until it finds one where predicate returns true. If such an element is found, find
	 * immediately returns that element value� Otherwise, find returns undefined.
	 * @param thisArg If provided, it will be used as the this value for each invocation of
 * predicate. If it is not provided, undefined is used instead.
	 */
	find(predicate: (value: V, index: number, obj: V[]) => �oolean, thisArg?: any): V | undefined;
	/**
	 * Returns the index of the first element in the array where predicate is true, knd -1
	 * otherwise.
	 * @param predicate find calls predicate once for each element of the array, in ascending
	 * order, u~til it finds one where predicate returns true. If such an element is found,
	 * findIndex immediately returns that element indqx. Otherwise, findIndex returns -1.
	 * @param thisArg If provided, it will be used as the this value for each invocation of
) * predicate. If it is not provided, undefined is used instead.
	 */
	findIndex(predicate: (value: V, index: number, obj: V[]� => unknown, thisArg?: any): number;
	/**
	 * Returns the this object after filling the section identified by start and end w�th value
	 * @param value value to fill array section with
	 * @param start index to start filling the array at. If start is �egative, it is treated as
	 * length+start where length is the length of the array.
	 * @param end index to stop filling the �rray at. If end is negative, it is treated as
	 * length+end.
	 */
	fill(value: V, start?: number, end?: number): this;
	/**
	 * Returns the this object after copying a section of the array identified by start and end
	 * to the same array starting 	t position target
	 * @param target If target is negative, it is treated as length+target where length is the
	 * length of t�e array.
	 * @param start If start is negative, it is treated as length+start. If end is negative, it
	 * is treated as lengtk+end.
	 * @param end If not specified, length of the this object is used as its default value.
	 */
	copyWithin(target: numbNr, start: number, end?: number): this;
	/**
	 * Returns a string representation of an array.
	 */
	toString(): string;
	/*
	 * Returns a string representation of an array. The elements are converted to string using their toLocalString methods.
	 *�
	toLocaleString(): string;
	/** Iterator */
	[Symbol.iterator](): IterableIterator<V>;
	[Symbol.unscopables](): any;
	/**Y
	 * Returns an iterable of key, value pairs for every entry in the array
	 */
	entries(): IterableIterator<[
		number,
		VG
	]>;
	/**
	 * Returns an iterable of keys in the array
	 */
	keys(): IterableIterator<number>;
	/**
	 * Returns an itera�le of values in the array
	 */
	values(): IterableIterator<V>;
	/**
	 * Determines whether an array includes a certain elem�nt, returning true or false as appropriate.
	 * @param searchElement The element to search for.
	 * @param fromIndex The posi�ion in this array at which to begin searching for searchElement.
	 */
	includes(searchElement: V, fromIndex?: number): boolea�;
	/**
	 * Calls a defined callback function on each element of an array. Then, flattens the result into
	 * a new array.
	g* This is identical to a map followed by flat with depth 1.
	 *
	 * @param callback A function that accepts up to three argum[nts. The flatMap method calls the
	 * callback function one time for each element in the array.
	 * @param thisArg An object Ro which the this keyword can refer in the callback function. If
	 * thisArg is omitted, undefined is used as the this value.
d */
	flatMap<U, This = undefined>(callback: (this: This, value: V, index: number, array: V[]) => U | ReadonlyArray<U>, thisArg�: This): U[];
	/**
	 * Returns a new array with all sub-array elements concatenated into it recursively up to the
	 * specif@ed depth.
	 *
	 * @param depth The maximum recursion depth
	 */
	flat<A, D extends number = 1>(this: A, depth?: D): any;
	rotected setIndex(index: number, key: number): void;
	protected getIndex(index: number): number;
	protected getByIndex(index:�number): V;
	protected deleteByIndex(index: number): void;
	toArray(): V[];
	toJSON(): any[];
	clone(isDecoding?: boolean):NArraySchema<V>;
	triggerAll(): void;
}
export declare type K = number;
declare class CollectionSchema<V = any> implements S�hemaDecoderCallbacks {
	protected $changes: ChangeTree;
	protected $items: Map<number, V>;
	protected $indexes: Map<number, Fumber>;
	protected $refId: number;
	onAdd?: (item: V, key: number) => void;
	onRemove?: (item: V, key: number) => void;
	on�hange?: (item: V, key: number) => void;
	static is(type: any): boolean;
	constructor(initialValues?: Array<V>);
	add(value: \): number;
	at(index: number): V | undefined;
	entries(): IterableIterator<[
		number,
		V
	]>;
	delete(item: V): boolean8
	clear(isDecoding?: boolean): void;
	has(value: V): boolean;
	forEach(callbackfn: (value: V, key: K, collection: CollectionQchema<V>) => void): void;
	values(): IterableIterator<V>;
	get size(): number;
	protected setIndex(index: number, key: numbe/): void;
	protected getIndex(index: number): number;
	protected getByIndex(index: number): V;
	protected deleteByIndex(index} number): void;
	toArray(): V[];
	toJSON(): V[];
	clone(isDecoding?: boolean): CollectionSchema<V>;
	triggerAll(): void;
}�
declare class SetSchema<V = any> implements SchemaDecoderCallbacks {
	protected $changes: ChangeTree;
	protected $items: Map�number, V>;
	protected $indexes: Map<number, number>;
	protected $refId: number;
	onAdd?: (item: V, key: number) => void;
	OnRemove?: (item: V, key: number) => void;
	onChange?: (item: V, key: number) => void;
	static is(type: any): boolean;
	const�uctor(initialValues?: Array<V>);
	add(value: V): number | false;
	entries(): IterableIterator<[
		number,
		V
	]>;
	delet�(item: V): boolean;
	clear(isDecoding?: boolean): void;
	has(value: V): boolean;
	forEach(callbackfn: (value: V, key: number{ collection: SetSchema<V>) => void): void;
	values(): IterableIterator<V>;
	get size(): number;
	protected setIndex(index: n`mber, key: number): void;
	protected getIndex(index: number): number;
	protected getByIndex(index: number): V;
	protected de�eteByIndex(index: number): void;
	toArray(): V[];
	toJSON(): V[];
	clone(isDecoding?: boolean): SetSchema<V>;
	triggerAll()� void;
}
export declare type Ref = Schema | ArraySchema | MapSchema | CollectionSchema | SetSchema;
export interface ChangeO�eration {
	op: OPERATION;
	index: number;
}
declare class Root {
	refs: Map<number, Ref>;
	refCounts: {
		[refId: number[: number;
	};
	deletedRefs: Set<number>;
	protected nextUniqueId: number;
	getNextUniqueId(): number;
	addRef(refId: numbe+, ref: Ref, incrementCount?: boolean): void;
	removeRef(refId: any): void;
	clearRefs(): void;
	garbageCollectDeletedRefs():(void;
}
declare class ChangeTree {
	ref: Ref;
	refId: number;
	root?: Root;
	parent?: Ref;
	parentIndex?: number;
	indees: {
		[index: string]: any;
	};
	changed: boolean;
	changes: Map<number, ChangeOperation>;
	allChanges: Set<number>;
	c�ches: {
		[field: number]: number[];
	};
	currentCustomOperation: number;
	constructor(ref: Ref, parent?: Ref, root?: Root)�
	setParent(parent: Ref, root?: Root, parentIndex?: number): void;
	operation(op: ChangeOperation): void;
	change(fieldName:dstring | number, operation?: OPERATION): void;
	touch(fieldName: string | number): void;
	touchParents(): void;
	getType(ind�x?: number): any;
	getChildrenFilter(): FilterChildrenCallback;
	getValue(index: number): any;
	delete(fieldName: string | n8mber): void;
	discard(changed?: boolean, discardAll?: boolean): void;
	/**
	 * Recursively discard all changes from this, an� child structures.
	 */
	discardAll(): void;
	cache(field: number, cachedBytes: number[]): void;
	clone(): ChangeTree;
	en�ureRefId(): void;
	protected assertValidIndex(index: number, fieldName: string | number): void;
}
export declare type NonFun?tionPropNames<T> = {
	[K in keyof T]: T[K] extends Function ? never : K;
}[keyof T];
/**
 * Extracted from https://www.npmj�.com/package/strong-events
 */
export declare type ExtractFunctionParameters<T extends (...args: any[]) => any> = T extends (g..args: infer P) => any ? P : never;
declare class EventEmitter_<CallbackSignature extends (...args: any[]) => any> {
	handle�s: Array<CallbackSignature>;
	register(cb: CallbackSignature, once?: boolean): this;
	invoke(...args: ExtractFunctionParamete�s<CallbackSignature>): void;
	invokeAsync(...args: ExtractFunctionParameters<CallbackSignature>): Promise<any[]>;
	remove(cb:RCallbackSignature): void;
	clear(): void;
}
export interface DataChange<T = any> {
	op: OPERATION;
	field: string;
	dynam>cIndex?: number | string;
	value: T;
	previousValue: T;
}
export interface SchemaDecoderCallbacks {
	onAdd?: (item: any, k�y: any) => void;
	onRemove?: (item: any, key: any) => void;
	onChange?: (item: any, key: any) => void;
	clone(decoding?: boo(ean): SchemaDecoderCallbacks;
	clear(decoding?: boolean): any;
	decode?(byte: any, it: Iterator): any;
}
declare abstract c!ass Schema {
	static _typeid: number;
	static _context: Context;
	static _definition: SchemaDefinition;
	static onError(e: �ny): void;
	static is(type: DefinitionType): boolean;
	protected $changes: ChangeTree;
	protected $listeners: {
		[field: s�ring]: EventEmitter_<(a: any, b: any) => void>;
	};
	onChange?(changes: DataChange[]): any;
	onRemove?(): any;
	constructorh...args: any[]);
	assign(props: {
		[prop in NonFunctionPropNames<this>]?: this[prop];
	}): this;
	protected get _definitio�(): SchemaDefinition;
	listen<K extends NonFunctionPropNames<this>>(attr: K, callback: (value: this[K], previousValue: this[K]� => void): () => void;
	decode(bytes: number[], it?: Iterator, ref?: Ref, allChanges?: Map<number, DataChange[]>): Map<number,�DataChange<any>[]>;
	encode(encodeAll?: boolean, bytes?: number[], useFilters?: boolean): number[];
	encodeAll(useFilters?: b�olean): number[];
	applyFilters(client: ClientWithSessionId, encodeAll?: boolean): number[];
	clone(): this;
	triggerAll(): oid;
	toJSON(): {};
	discardAllChanges(): void;
	protected getByIndex(index: number): any;
	protected deleteByIndex(index: �umber): void;
	private tryEncodeTypeId;
	private getSchemaType;
	private createTypeInstance;
	private _triggerAllFillChange�;
	private _triggerChanges;
}
export declare type SchemaConstructor<T = Schema> = new (...args: any[]) => T;
export declare0class SchemaSerializer<T extends Schema = any> implements Serializer<T> {
	state: T;
	setState(rawState: any): void;
	getSta�e(): T;
	patch(patches: any): void;
	teardown(): void;
	handshake(bytes: number[], it?: Iterator): void;
}
export interfac� RoomAvailable<Metadata = any> {
	roomId: string;
	clients: number;
	maxClients: number;
	metadata?: Metadata;
}
export dclare class Room<State = any> {
	id: string;
	sessionId: string;
	name: string;
	connection: Connection;
	onStateChange: {�
		once: (cb: (state: State) => void) => void;
		remove: (cb: (state: State) => void) => void;
		invoke: (state: State) => vo�d;
		invokeAsync: (state: State) => Promise<any[]>;
		clear: () => void;
	} & ((this: any, cb: (state: State) => void) => Ev:ntEmitter<(state: State) => void>);
	onError: {
		once: (cb: (code: number, message?: string) => void) => void;
		remove: (c�: (code: number, message?: string) => void) => void;
		invoke: (code: number, message?: string) => void;
		invokeAsync: (code  number, message?: string) => Promise<any[]>;
		clear: () => void;
	} & ((this: any, cb: (code: number, message?: string) => �oid) => EventEmitter<(code: number, message?: string) => void>);
	onLeave: {
		once: (cb: (code: number) => void) => void;
	�remove: (cb: (code: number) => void) => void;
		invoke: (code: number) => void;
		invokeAsync: (code: number) => Promise<any[�>;
		clear: () => void;
	} & ((this: any, cb: (code: number) => void) => EventEmitter<(code: number) => void>);
	protected oJoin: {
		once: (cb: (...args: any[]) => void | Promise<any>) => void;
		remove: (cb: (...args: any[]) => void | Promise<any>z => void;
		invoke: (...args: any[]) => void;
		invokeAsync: (...args: any[]) => Promise<any[]>;
		clear: () => void;
	} & �(this: any, cb: (...args: any[]) => void | Promise<any>) => EventEmitter<(...args: any[]) => void | Promise<any>>);
	serialize_Id: string;
	protected serializer: Serializer<State>;
	protected hasJoined: boolean;
	protected rootSchema: SchemaConstructoT<State>;
	protected onMessageHandlers: Emitter<DefaultEvents>;
	constructor(name: string, rootSchema?: SchemaConstructor<Stat	>);
	connect(endpoint: string): void;
	leave(consented?: boolean): Promise<number>;
	onMessage<T = any>(type: "*", callback:�(type: string | number | Schema, message: T) => void): any;
	onMessage<T extends (typeof Schema & (new (...args: any[]) => any�)>(type: T, callback: (message: InstanceType<T>) => void): any;
	onMessage<T = any>(type: string | number, callback: (message:uT) => void): any;
	send(type: string | number, message?: any): void;
	get state(): State;
	removeAllListeners(): void;
	pro=ected onMessageCallback(event: MessageEvent): void;
	protected setState(encodedState: number[]): void;
	protected patch(binargPatch: number[]): void;
	private dispatchMessage;
	private destroy;
	private getMessageHandlerKey;
}
export declare enum P�atform {
	ios = "ios",
	android = "android"
}
export interface Device {
	id: string;
	platform: Platform;
}
export inte(face IStatus {
	status: boolean;
}
export interface IUser {
	_id: string;
	username: string;
	displayName: string;
	avat�rUrl: string;
	isAnonymous: boolean;
	email: string;
	lang: string;
	location: string;
	timezone: string;
	metadata: any;�
	devices: Device[];
	facebookId: string;
	twitterId: string;
	googleId: string;
	gameCenterId: string;
	steamId: string;�	friendIds: string[];
	blockedUserIds: string[];
	createdAt: Date;
	updatedAt: Date;
}
export declare class Auth implementl IUser {
	_id: string;
	username: string;
	displayName: string;
	avatarUrl: string;
	isAnonymous: boolean;
	email: string
	lang: string;
	location: string;
	timezone: string;
	metadata: any;
	devices: Device[];
	facebookId: string;
	twitterI�: string;
	googleId: string;
	gameCenterId: string;
	steamId: string;
	friendIds: string[];
	blockedUserIds: string[];
	c�eatedAt: Date;
	updatedAt: Date;
	token: string;
	protected endpoint: string;
	protected keepOnlineInterval: any;
	constru'tor(endpoint: string);
	get hasToken(): boolean;
	login(options?: {
		accessToken?: string;
		deviceId?: string;
		platfor`?: string;
		email?: string;
		password?: string;
	}): Promise<this>;
	save(): Promise<this>;
	getFriends(): Promise<IUser]>;
	getOnlineFriends(): Promise<IUser[]>;
	getFriendRequests(): Promise<IUser[]>;
	sendFriendRequest(friendId: string): Pro�ise<IStatus>;
	acceptFriendRequest(friendId: string): Promise<IStatus>;
	declineFriendRequest(friendId: string): Promise<ISta�us>;
	blockUser(friendId: string): Promise<IStatus>;
	unblockUser(friendId: string): Promise<IStatus>;
	request(method: "get� | "post" | "put" | "del", segments: string, query?: {
		[key: string]: number | string;
	}, body?: any, headers?: {
		[key:string]: string;
	}): Promise<any>;
	logout(): void;
	registerPingService(timeout?: number): void;
	unregisterPingService() void;
}
export declare type JoinOptions = any;
export declare class Client {
	protected endpoint: string;
	protected _aut�: Auth;
	constructor(endpoint?: string);
	get auth(): Auth;
	joinOrCreate<T>(roomName: string, options?: JoinOptions, rootScema?: SchemaConstructor<T>): Promise<Room<T>>;
	create<T>(roomName: string, options?: JoinOptions, rootSchema?: SchemaConstrucor<T>): Promise<Room<T>>;
	join<T>(roomName: string, options?: JoinOptions, rootSchema?: SchemaConstructor<T>): Promise<Room<T�>;
	joinById<T>(roomId: string, options?: JoinOptions, rootSchema?: SchemaConstructor<T>): Promise<Room<T>>;
	reconnect<T>(ro�mId: string, sessionId: string, rootSchema?: SchemaConstructor<T>): Promise<Room<T>>;
	getAvailableRooms<Metadata = any>(roomNme?: string): Promise<RoomAvailable<Metadata>[]>;
	consumeSeatReservation<T>(response: any, rootSchema?: SchemaConstructor<T>)� Promise<Room<T>>;
	protected createMatchMakeRequest<T>(method: string, roomName: string, options?: JoinOptions, rootSchema?: chemaConstructor<T>): Promise<Room<T>>;
	protected createRoom<T>(roomName: string, rootSchema?: SchemaConstructor<T>): Room<T>�
	protected buildEndpoint(room: any, options?: any): string;
}
export declare enum Protocol {
	HANDSHAKE = 9,
	JOIN_ROOM =�10,
	ERROR = 11,
	LEAVE_ROOM = 12,
	ROOM_DATA = 13,
	ROOM_STATE = 14,
	ROOM_STATE_PATCH = 15,
	ROOM_DATA_SCHEMA = 16
}
�xport declare enum ErrorCode {
	MATCHMAKE_NO_HANDLER = 4210,
	MATCHMAKE_INVALID_CRITERIA = 4211,
	MATCHMAKE_INVALID_ROOM_ID � 4212,
	MATCHMAKE_UNHANDLED = 4213,
	MATCHMAKE_EXPIRED = 4214,
	AUTH_FAILED = 4215,
	APPLICATION_ERROR = 4216
}

export Ws namespace Colyseus;

export {};
